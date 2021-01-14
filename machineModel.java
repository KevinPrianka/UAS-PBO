/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
public class machineModel {
    private String Vehicles;
    private String Passanger;
    private int Code;
    private int Price;
    private int Balance;
    private int Total;
    
    public machineModel(int nom)
    {
        Price = nom;
        Balance = 0;
        Total = 0;
    }
    
    //SETTER
    public void setVehicles (String vehicles)
    {
        this.Vehicles = vehicles;
    }    
    public void setPassanger(String passanger)
    {
        this.Passanger = passanger;
    }
    
    public void setCode(int code)
    {
        this.Code = code;
    }
    public void setPrice(int price)
    {
        this.Price = price;
    }
    
    public void setBalance(int balance)
    {
        this.Balance = balance;
    }
    
    //GETTER
  public String getVehicles() {
    return Vehicles;
  }  
  public String getPassanger() {
    return Passanger;
  }
  
  public int getCode() {
    return Code;
  }
  
  public int getPrice() {
    return Price;
  }
  
  public int getBalance() {
    return Balance;
  }
 
    
    
    
    public void masuk(int am)
    {
        Balance = Balance + am;
    }
    
    public void print(int am)
    {
        Total = am*Price;
        if(Balance>=Total){
            for(int i=0;i<am;i++){
                System.out.println("=====================");
                //System.out.println("= Tiket" + kendaraan + "=");
                System.out.println("= Rp "+Price+"=");
                System.out.println("=====================");
            }
            Balance = Balance - Total;
        }
        else System.out.println("Saldo tidak cukup");
        
    }
    
    public int kembali()
    {
        if(Balance>0){
            Balance = 0; 
        }
        
        return Balance;
    }
}
