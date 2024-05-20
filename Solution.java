class Solution
{
    public int[][] flipAndInvertImage(int[][] image)
    {
        int n = image.length;

        for(int[] row : image)
        {
            for(int i = 0; i < (n+1)/2; i++)
            {
                int temp = row[i]^1;
                row[i] = row[n-1-i]^1;
                row[n-1-i] = temp;
            }
        }

        return image;

    }

    public static void main(String[] args)
    {
        Solution mySolution = new Solution();


        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        int[][] result = mySolution.flipAndInvertImage(image);

        for(int[] row : result)
        {
            for(int val : row)
            {
                System.out.println(val+"");
            }
        }
    }
}