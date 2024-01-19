public class pattern {
    public static void main(String[] args) {
        // int n=10;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==0 || j==0 || i==n-1 || j==n-1){
        //             System.out.print("*");
        //         } else{System.out.print(" ");}
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // int Y=15;
        // for(int i=0; i<Y; i++){
        //     for(int j=0; j<Y; j++){
        //         if(i==0||j==0||j==Y-1||i==(Y-1)/2){
        //             System.out.print("*");
        //         }else{System.out.print(" ");}
        //     }System.out.println();
        // }
        // System.out.println();
        // int n=10;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(j==0 || j==n-1||i==(n-1)/2){
        //             System.out.print("*");
        //         }else{System.out.print(" ");}
        //     }System.out.println();
        // }
        // int n=10;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 && j>0 && j<(n-2)/2 || j==0 && i>0 || i==(n-2)/2 && j<=(n-2)/2 || j==(n-2)/2 && i>0){
        //             System.out.print("!");
        //         }else{System.out.print(" ");}
        //     }System.out.println();
        // }
        // System.out.println();
        // int n=8;
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<n;j++){
        //         if(i==j || i+j==n){
        //             System.out.print("*");
        //         }else{System.out.print(" ");}
        //     }System.out.println();
        // }
        // int n=10;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || j==0 || j==n-1 || i==n-1 || i==j||i+j==n){
        //             System.out.print("*");
        //         }else{System.out.print(" ");}
        //     }System.out.println();
        // }
        // int n=29;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if (i==0 ||j==0||i==n-1 || j==n-1 || i==j || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2){
        //             System.out.print("*");                    
        //         }else{System.out.print(" ");}
        //     }
        //     System.out.print(" ");
        //     for(int j=0;j<n;j++){
        //         if (i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2|| i==0 || j==0 || i==n-1|| j==n-1){
        //             System.out.print("*");                    
        //         }else{System.out.print(" ");}
        //     }
        //     System.out.println();
        //     }
        int n=29;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j<=(n-1)/2|| j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
                 i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2||j-i>=(n-1)/2 ||
                  j==0 && i>=(n-1)/2 || i==n-1 && j<=(n-1)/2||i-j>=(n-1)/2 ||
                  j==n-1 && i>=(n-1)/2 || i==n-1 && j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2){
                    System.out.print("*");
                }else{System.out.print(" ");}
            }System.out.println();
        }
        }
    }
    