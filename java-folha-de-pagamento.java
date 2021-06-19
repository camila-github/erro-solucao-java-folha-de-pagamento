import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class FolhaDePagamento {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numeroDoFuncionario = Integer.parseInt(st.nextToken());
 
    st = new StringTokenizer(br.readLine());
    int quantidadeHoraTrabalhada = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    double valorPorHora = Double.parseDouble(st.nextToken());

    double salario = quantidadeHoraTrabalhada * valorPorHora; 
    
    System.out.println("NUMBER = " + numeroDoFuncionario);
    System.out.printf("SALARY = U$ %.2f", salario);
  }
}
