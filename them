class Store{
 constructor(name){
     this.name=name;
     this.items=[];
     this.stock={};
     this.price={};
     this.totalSales=0;
  }
  isItemAvailable(name){
       var itemIndex=this.items.indexOf(name);
       if(itemIndex==-1){
            return false;
       }
       else{
          return true;
       }
  }

  getPrice(name){
      var isAvailable=this.isItemAvailable(name);
      if(isAvailable==true){
           var price=this.prices[name];
           return price;
      }
      else{
         console.log("sorry we do not have this item",name);
      }
  }

  getTotalSale(){
     return this.totalSales;
  }
  sellItem(name,quantity){
        var available=this.stock[name];
        if(available,quantity){
            console.log("Sorry! We do not have enough");
            reture;
        }
        else{
           var itemPrice=this.getPrice(name);
           var currentSale=itemPrice*quantity;
           this.totalSales=this.totalSales+currentSale;
           var remaining=available-quantity;
           this.stock[name]=remaining;
           console.log("Thanks for your purcase");
         }
    }

    addItem(name,quantity,price){
        var isExisting=this.isItemAvailable(name);
        if(isExisting==true){
             var available=this.stock[name];
             this.stock[name]=available+quantity;
        }
        else{
             this.items.push(name);
             this.prices[name]=price;
             this.stock[name]=quantity;
         }
     }
  }
  var rakibStore=new Store("Bangladesh-China Fashion Store");
  rakibStore.addItem("shirt",40,300);
  rakibStore.addItem("pant",50,500);
  rakibStore.addItem("Tshirt",70,200);
  rakibStore.addItem("Cap",30,100);
  rakibStore.addItem("shoes",80,1000);
  rakibStore.addItem("Jacket",40,1500);