
public class NamePattern {
    public static void main(String[] args) {
         int n=7;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//D
			{
			if(i==0 && j!=n-1&&j!=n-2||j==0||j==n-1&&i!=0&&i!=n-1&&i!=1&&i!=n-2||i==n-1&&j!=n-1&&j!=n-2||i==1&&j!=1&&j!=2&&j!=3&&j!=4&&j!=n-1||i==n-2&&j!=1&&j!=2&&j!=3&&j!=4&&j!=n-1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
       	
			for(int j=0;j<n;j++)//H
			{
			if(j==(n-1)||j==0||i==(n-1)/2) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//A
			{
			if(i==0&&j!=0&&j!=n-1&&j!=1&&j!=n-2||j==(n-1)&&i!=0&&i!=1||j==0&&i!=0&&i!=1||i==(n-1)/2||i==1&&j!=0&&j!=2&&j!=3&&j!=4&&j!=n-1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//R
			{
			if(i==0&&j<n-2 ||j==(n-2)&& i!=0&& i!=(n-1)/2&&i!=n-2&&i!=n-3||j==0||i==(n-1)/2&& j!=n-2&&j!=n-1
			||i==n-3&&j!=1&&j!=3&&j!=4&j!=5&&j!=n-1||i==n-2&&j!=1&&j!=2&&j!=4&j!=5&&j!=n-1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");//M
			for(int j=0;j<n;j++)
			{
			if(i==1&&j!=(n-1)/2 &&j!=1&&j!=n-2||j==0||j==n-1||i==2&&j!=1&&j!=2&&j!=4&&j!=5) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//A
			{
			if(i==0&&j!=0&&j!=n-1&&j!=1&&j!=n-2||j==(n-1)&&i!=0&&i!=1||j==0&&i!=0&&i!=1||i==(n-1)/2||i==1&&j!=0&&j!=2&&j!=3&&j!=4&&j!=n-1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("            ");
			for(int j=0;j<n;j++)//T
			{
			if(i==0 ||j==(n-1)/2) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//E
			{
			if(i==0 ||j==0||i==n-1||i==(n-1)/2) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//J
			{
			if(i==0 ||j==(n-1)/2||i==n-1&&j<(n-1)/2) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//A
			{
			if(i==0&&j!=0&&j!=n-1&&j!=1&&j!=n-2||j==(n-1)&&i!=0&&i!=1||j==0&&i!=0&&i!=1||i==(n-1)/2||i==1&&j!=0&&j!=2&&j!=3&&j!=4&&j!=n-1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			
			System.out.println();
		}
	}



}

