
package metodosnumericos;
import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class ProductoMatrices {
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        
        
        
        int filaA;
        int columnaA;
        int filaB;
        int columnaB;
        
        System.out.println("digite el numeor de fila de la matriz A");
        filaA = captura.nextInt();
        System.out.println("digite el numero de columna de la matriz A");
        columnaA = captura.nextInt();
        System.out.println("digite el numeor de fila de la matriz B");
        filaB = captura.nextInt();
        System.out.println("digite el numero de columna de la matriz B");
        columnaB = captura.nextInt();
      
        if((columnaA==filaB)){
            double A[][] = new double[filaA][columnaA];
            double b[][] = new double[filaB][columnaB];
            double resultado[][] = new double[columnaA][filaB];
            
            System.out.println("cargar datos de la matriz A");
            for(int i =0;i<filaA;i++){
                for(int j=0;j<columnaA;j++){
                    System.out.println("digite el valor de la matriz A  "+i+" "+j);
                    A[i][j]=captura.nextDouble();

                }

            }
            
            System.out.println("cargar datos de la matriz B");
            for(int i =0;i<filaB;i++){
                for(int j =0;j<columnaB;j++){
                    System.out.println("digite el valor de la matriz B  "+i+" "+j);
                    b[i][j]=captura.nextDouble();

                }
            }
            
            for(int i =0;i<filaA;i++){
                for(int j =0;j<columnaB;j++){
                    for(int k =0;k<columnaA;k++){
                        resultado[i][j] += A[i][k] * b[k][j];
                    }
                }
            }
            for(int i =0;i<filaA;i++){
                System.out.println("\n");
                for(int j =0;j<columnaB;j++){
                    System.out.print(" | "+resultado[i][j]+" |");

                }
            }
            
            
        }else{
            System.out.println("no cumple la condicion para la suma de matrices");
        }
        
    }
    
}
