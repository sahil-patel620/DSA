package Arrays.Practices;

// Two pointer approach, most efficient Rainwater trapping solution
// time complexity = O(n);
// space complexity = O(1);
public class Q4TrappedRainwaterTwoPointer {
    public static int trappedWater(int height[]) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int totWater = 0;
        int Lmax = height[l];
        int Rmax= height[r];

        while(l<r){
            if(Lmax < Rmax){
                l++;
                Lmax = Math.max(Lmax, height[l]);
                totWater += Lmax - height[l];
            }else{
                r--;
                Rmax = Math.max(Rmax, height[r]);
                totWater += Rmax - height[r];
            }
        }
        return totWater;
    }

    public static void main(String[] args) {
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total trapped Water = "+ trappedWater(height));
    }
}
