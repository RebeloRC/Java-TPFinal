import java.util.Scanner;

public class Hora {
	
	private int hora;
	private int min;
	private int seg;
	
	public Hora() {
		
		this.setHora();
		this.setMin();
		this.setSeg();
		
	}
	
	public Hora(int h, int m, int s) {
		
		this.setHora(h);
		this.setMin(m);
		this.setSeg(s);
		
	}

    public void setHora(int h){
        if(h < 0 || h > 23){
             System.out.println("O valor da hora deve ser positivo e menor que 24!");
             return;
        }

        this.hora = h;
   }

   public void setMin(int m){
        if(m < 0 || m > 59){
             System.out.println("O valor do minuto deve ser positivo e menor que 60!");
             return;
        }


        this.min = m;
   }

   public void setSeg(int s){
        if(s < 0 || s > 59){
             System.out.println("O valor do segundo deve ser positivo e menor que 60!");
             return;
        }

        this.seg = s;
   }
	
	
	public void setHora() {
		int h;
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Entre com a hora desejada: ");
			h = scan.nextInt();
			
			if(h < 0 || h > 24) {
				System.out.println("O valor digitado deve ser positivo e menor que 24!");
			}
			
		}while(h < 0 || h > 24);
		
		this.hora = h;
	}
	
	
	public void setMin() {
		int m;
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Entre com o minuto desejado: ");
			m = scan.nextInt();
			
			
			if(m < 0 || m > 60) {
				System.out.println("O valor digitado deve ser positivo e menor que 60!");
			}
			
		}while(m < 0 || m > 60);
		
		this.min = m;
	}
	

	public void setSeg() {
		int s;
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Entre com o segundo desejado: ");
			s = scan.nextInt();
			
			
			if(s < 0 || s > 60) {
				System.out.println("O valor digitado deve ser positivo e menor que 60!");
			}
			
		}while(s < 0 || s > 60);
		
		this.seg = s;
	}
	
    public int getHora(){
        return this.seg;
   }

   public int getMin(){
        return this.min;
   }

   public int getSeg(){
        return this.seg;
   }
   
   public int getSegundos()
   {
        return (this.hora * 3600) + (this.min * 60) + this.seg;
   }
   
   public String getHora1()
   {
        String horaStr, minStr, segStr;

        horaStr = this.hora < 10 ? "0" + this.hora : Integer.toString(this.hora);
        minStr = this.min < 10 ? "0" + this.min : Integer.toString(this.min);
        segStr = this.seg < 10 ? "0" + this.seg : Integer.toString(this.seg);

        return horaStr + ":" + minStr + ":" + segStr;
   }
   
   public String getHora2()
   {
        int horaPeriodo = this.hora;
        String horaStr, minStr, segStr, periodoStr;

        periodoStr = horaPeriodo < 12 ? "AM" : "PM";

        if(horaPeriodo == 0){
             horaPeriodo = 12;
        }

        if(horaPeriodo > 12){
             horaPeriodo -= 12;
        }


        horaStr = horaPeriodo < 10 ? "0" + horaPeriodo : Integer.toString(horaPeriodo);
        minStr = this.min < 10 ? "0" + this.min : Integer.toString(this.min);
        segStr = this.seg < 10 ? "0" + this.seg : Integer.toString(this.seg);

        return horaStr + ":" + minStr + ":" + segStr + periodoStr;
   }

}