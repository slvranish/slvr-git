/*
 Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
  
 */


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