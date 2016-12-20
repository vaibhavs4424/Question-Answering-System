// file for QUestion answering system to answer questions based on ai and nlp in natural language from text files given
package abc;
import java.io.*;
import java.util.*;

 
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

//@aurthor Vaibhav Shukla
public class Dynamicedited {
    Scanner src=new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    static int count7=0;
static int countMax1=0,index7=0;
static int count=0,actor=0;
static int countMax=0,index=0;

    static boolean flag=false;
static boolean flag1=false;
static int temp,q=0,counter=0,temp1=0,counter1=0,c6=0,counter4=0,l=0,count6,counter2,counter3,counter8,c9,r1=0,r2=0,r3=0;
static int index1[];
           static String arr[][],verb1[]=new String[1000],verb[][],het[],shet[],he[],she[],he3[],she3[];
           //static String he[]={"woodcutter","fox","hare","tortoise","him","he"};
           static String he1[]={"Woodcutter","Hare","Tortoise","Fox","Prof.Avinash","Vaibhav"};
           static String she1[]={"Fairy","Meera","Archana"};
           static int x = 0,max=0,g=0,g1=0;
           static String copy = null;

      String[] question14() //takes a question from the user & returns input[] 

{
    
System.out.println("Enter your question :");
String in=src.nextLine();
StringTokenizer st=new StringTokenizer(in, " ", false); //tokenizes the question
int sp=st.countTokens();
String input[]=new String[sp]; //question is stored in input[]
for(int w=0;w<sp;w++)
input[w]=st.nextToken();
//for(int w=0;w<sp;w++)
//System.out.println(input[w]);
System.out.println();
System.out.println();
return input;
}

       
       
       
       
    public void words14() throws Exception
    {int ch1=0;
        // TODO code application logic here
        MaxentTagger tagger = new MaxentTagger("D:\\final yr proj\\taggers\\wsj-0-18-left3words.tagger");
         // The sample string
        Scanner src=new Scanner(System.in);
        File f=null;
        do
        {
        System.out.println("Welcome to Question Answering system");
         System.out.println("Select a story of your choice");
          System.out.println("1.The Woodcutter and the Fairy");
          System.out.println("2.The Hare and the Tortoise");
          System.out.println("3.The Fox and the Grapes");
          
          System.out.println("4.The 3 Friends");
          System.out.println("5.Exit");
          System.out.println("Enter your choice");
           ch1=src.nextInt();
           
           switch(ch1){
               case 1:
               f = new File("D:\\final yr proj\\honest.txt");
               break;
               case 2:
                f = new File("D:\\final yr proj\\hare.txt");
               break;
               case 3:
                f = new File("D:\\final yr proj\\fox.txt");
               break;
               case 4:
                f = new File("D:\\final yr proj\\friends.txt");
               break; 
               default: System.out.println("Wrong choice");   
               
           }
           
           
           }while(ch1!=1 && ch1!=2 && ch1!=3 && ch1!=4);
        
        
        
        
        
        BufferedReader br = new BufferedReader(new FileReader(f));
        String arr1[][];
        int i = 0;
        String s;
        String a[] = new String[320];
        while ((s = br.readLine()) != null) {

            a[i] = s; //all the sentences of each line stored in a[]


            i++; //final value of i will be equal to number of sentences
        }

        for (int j = 0; j < i; j++) {

            StringTokenizer st = new StringTokenizer(a[j], " ", false); //tokenizes every sentence
            int sp = st.countTokens(); //sp is total no. of tokens in every sentence

            if (max < sp) {
                max = sp; //finds max of all the sps
            }
        }
        g = i;
        arr = new String[g][max]; //creates 2-d array with rows-no.of sentences col-max sp
        for (int j = 0; j < i; j++) {

            StringTokenizer st = new StringTokenizer(a[j], " ", false);
            int sp = st.countTokens();
            for (int q = 0; q < sp; q++) {
                arr[j][q] = st.nextToken(); //stores every word of the passage in arr[][]
            }
        }
        for(int m=0;m<i;m++)
                
{
for(int n=0;n<max;n++)
    
{
if(arr[m][n]!=null)
System.out.print(arr[m][n]+" "); //prints the passage

}
System.out.println();

}
        
     
        
        
        
        
        
        
        
        
        
        
   
    het=new String[100];
    shet=new String[100];
    
        
     int e1=0,r1=0;
 for(int y=0;y<g;y++)
     for(int z=0;z<max;z++)
     {
         for(int u=0;u<he1.length;u++)
         {
             if(arr[y][z]!=null)
             {
                 if(arr[y][z].equalsIgnoreCase(he1[u]))
                 {
                   het[e1]=he1[u];
                   e1++;
                 }
             }
         }
                 for(int f1=0;f1<she1.length;f1++)
                 {
                     if(arr[y][z]!=null)
             if(arr[y][z].equalsIgnoreCase(she1[f1]))
                 {
                   shet[r1]=she1[f1];
                   r1++;
                 }
             }
         
     }
        //he=new String[e1-1];
        //she=new String[r1-1];
        int count223=0;
         for(int y=0;y<e1;y++)
      {
          for(int r=y+1;r<e1;r++)
          {
              if(het[r]!=null)
              if(het[y].equalsIgnoreCase(het[r]))
              {
                  het[r]="zz";
                  count223++;
              }
          }
          
      }
      //int count33=x1-count22;
      he3=new String[100];
      
      
       
      int y11=0;
      for(int u=0;u<e1;u++)
      { if(het[u]!=null)
          if(!het[u].equals("zz") )
      {
          //System.out.println(het[u]);
          he3[y11]=het[u];
          y11++;
      }
          
      }
     
       
      
      
      
      
      
      
       int count224=0;
         for(int y=0;y<r1;y++)
      {
          for(int r=y+1;r<r1;r++)
          {
              if(shet[r]!=null )
              if(shet[y].equalsIgnoreCase(shet[r]))
              {
                  shet[r]="zz";
                  count224++;
              }
          }
          
      }
      //int count33=x1-count22;
      //String verb2[]=new String[1000];
      she3=new String[100];
       
      int y111=0;
      for(int u=0;u<r1;u++)
      {if(shet[u]!=null)
          if(!shet[u].equals("zz"))
      {
          she3[y111]=shet[u];
          y111++;
      }
          
      }
      int p1=0,p2=0;
      for(int i6=0;i6<he3.length;i6++)
          if(he3[i6]!=null)
          p1++;
      
      for(int i6=0;i6<she3.length;i6++)
          if(she3[i6]!=null)
          p2++;
     // System.out.print(p2);
      he=new String[p1+3];
      she=new String[p2+2];
      
      int t1=0,t2=0;
      for(int i6=0;i6<he3.length;i6++)
      {
          if(he3[i6]!=null)
          { he[t1]=he3[i6];
            t1++;
      }
      }
      for(int i6=0;i6<she3.length;i6++)
      {
          if(she3[i6]!=null)
          { she[t2]=she3[i6];
            t2++;
      }
      }
      
      System.out.println();
      System.out.println();
     
     /* 
       * System.out.println("The Actors in the passage :");
      for(int v1=0;v1<he.length;v1++)
      {if(he[v1]!=null)
          System.out.println(he[v1]+" ");
      }
       * 
     
       for(int v1=0;v1<she.length;v1++)
           if(she[v1]!=null)
          System.out.println(she[v1]+" ");
       */   
        he[t1]="him";
        t1++;
        he[t1]="his";
        t1++;
        he[t1]="he";
        she[t2]="her";
        t2++;
        she[t2]="she";
        
        
        int i7=0;
        
 String a1,b1;
 char res1,res2,res3;
 boolean flag44=false;
 int x=0,x1=0,flag7=0,count22=0;
        // The tagged string
  for(int e=0;e<g;e++)
        {
            for(int t=0;t<max;t++)
            {
                c: if(arr[e][t]!=null)
                {
              String tagged = tagger.tagString(arr[e][t]);
              //System.out.print(tagged);
              StringTokenizer st1 = new StringTokenizer(tagged, "_", false); //tokenizes every sentence
              a1=st1.nextToken();
              //System.out.print(a1);
               
               b1=st1.nextToken();
               //System.out.print(b1);
               // System.out.println();
               if(b1.equalsIgnoreCase("VB ")||b1.equalsIgnoreCase("VBG ")||b1.equalsIgnoreCase("VBD ")||b1.equalsIgnoreCase("VBn ")||b1.equalsIgnoreCase("VBz ")||b1.equalsIgnoreCase("VBp "))
               {
                   
                   
                   verb1[x1]=a1;
                   x1++;
                   
                   
                 /* //System.out.print(a1);
                 // System.out.println(b1);
                   if(flag7==0)
                   {
                       //System.out.println(a1);
                      verb1[x1]=a1;
                      System.out.println(verb1[x1]);
                      flag7=3;
                      x1++; 
                      break c;
                   }
                   for(int m=0;m<x1;m++)
                   {
                       if(verb1[m].equalsIgnoreCase(a1))
                       {   // System.out.println("hahahaha");
                       flag44=true;
                   }
                   }
                   if(!flag44 && flag7==3)
                   {
                      //System.out.println("hahahaha");
                      verb1[x1]=a1;
                      System.out.println(verb1[x1]);
                      //System.out.println(e);
                      
                      x1++;
                   }
                   
              */ }

             
                }
               
            }
             
        }
 // System.out.println(g);
                      
    /*  for(int w=0;w<x1;w++)
            
        System.out.println(verb1[w]);
      */
      for(int y=0;y<verb1.length;y++)
      {
          for(int r=y+1;r<verb1.length;r++)
          {
              if(verb1[r]!=null)
              if(verb1[y].equalsIgnoreCase(verb1[r]))
              {
                  verb1[r]="zz";
                  count22++;
              }
          }
          
      }
      int count33=x1-count22;
      String verb2[]=new String[1000];
      
      //System.out.println("hahahaha");
      
      // for(int w=0;w<x1;w++)
            
       // System.out.println(verb1[w]);
       
      int y1=0;
      for(int u=0;u<x1;u++)
      {
          if(!verb1[u].equals("zz"))
      {
          verb2[y1]=verb1[u];
          y1++;
      }
          
      }
      verb2[y1]="upset";
      y1++;
      verb2[y1]="feeling";
      y1++;
      verb2[y1]="quench";
      y1++;
      verb2[y1]="run";
      y1++;
      verb2[y1]="saw";
      y1++;
      verb2[y1]="put";
      y1++;
      verb2[y1]="challenge";
      y1++;
      verb2[y1]="dance";
      y1++;
      verb2[y1]="race";
      y1++;
      verb2[y1]="start";
      y1++;
      verb2[y1]="show";
      y1++;
      verb2[y1]="buy";
      y1++;
      verb2[y1]="disowned";
      y1++;
      verb2[y1]="helpful";
      y1++;
      
      
      
      verb=new String[y1][5];
      File f1=new File("D:\\final yr proj\\irregular.txt");
BufferedReader br1=new BufferedReader(new FileReader(f1));
 String s1;
int x12=0;
String v1=null,v2=null;
int hell1=0;
String copy= null;

int i1 =0;

String a12[]=new String[3200];
while((s1=br1.readLine())!=null)
{

a12[i1]=s1; //all the sentences of each line stored in a[]


i1++; //final value of i will be equal to number of sentences
}
//System.out.print(index1[i1]);
g1=i1;
arr1 = new String[i1][4]; //creates 2-d array with rows-no.of sentences col-max sp


for(int j4=0;j4<i1;j4++)
{

StringTokenizer st=new StringTokenizer(a12[j4], " ", false);
int sp=st.countTokens();

for(int q1=0;q1<sp;q1++)
{
arr1[j4][q1]=st.nextToken(); 
}
}     
   
  int hell[] = new int[y1];
  for(int u=0;u<y1;u++)
      hell[u]=-1;
for(int j=0;j<y1;j++)
{
    for(int m=0;m<i1;m++)

{
for(int n=0;n<4;n++)    
    {
        if(verb2[j].equalsIgnoreCase(arr1[m][n]))
           hell[j]=m; 
    }
}
}   
     
     for(int j=0;j<y1;j++)
     { 
         v1=verb2[j];
         if(hell[j]==-1)
         {
            
          res3= v1.charAt(v1.length()-1);
          res2 = v1.charAt(v1.length()-2);
          res1 = v1.charAt(v1.length()-3);
          if(res3=='d'&& res2=='e')
              
          {
              verb[hell1][0]=v1;
              verb[hell1][2]=v1;
              verb[hell1][1]=v1.substring(0, v1.length()-2);
              verb[hell1][3]="will "+v1.substring(0, v1.length()-2);
              verb[hell1][4]=v1.substring(0, v1.length()-2)+"ing";
              hell1++;
          }
          
          else if(res3=='g'&& res2=='n' && res1=='i' )
           {
               verb[hell1][0]=v1;
               verb[hell1][4]=v1;
              verb[hell1][1]=v1.substring(0, v1.length()-3);
              verb[hell1][3]="will "+v1.substring(0, v1.length()-3);
              verb[hell1][2]=v1.substring(0, v1.length()-3)+"ed";
              hell1++;
           }
          else if(res3=='e')
          {
              verb[hell1][0]=v1;
              verb[hell1][1]=v1;
              verb[hell1][2]=v1+"d";
              verb[hell1][3]="will "+v1;
              v2=v1.substring(0,v1.length()-2);
              verb[hell1][4]=v2+"ing";
              hell1++; 
          }
                  
          else
          {
              verb[hell1][0]=v1;
              verb[hell1][1]=v1;
              verb[hell1][2]=v1+"ed";
              verb[hell1][3]="will "+v1;
              verb[hell1][4]=v1+"ing";
              hell1++;
          }
           }
             
            else 
      {
          verb[hell1][0]=v1;
        verb[hell1][1]=arr1[hell[j]][0];
        verb[hell1][2]=arr1[hell[j]][1];
        verb[hell1][3]="will "+arr1[hell[j]][0];
        verb[hell1][4]=arr1[hell[j]][3];
        hell1++;
        
    }
         }
   System.out.println();
   System.out.println();
   /* 
    for(int u=0;u<hell1;u++)
    {
        for(int r=0;r<5;r++)
            System.out.print(verb[u][r]+" ");
            System.out.println();       
    }
    System.out.println();
    
    
    */
    
    
    
    

}
    
    public void compare14(String inputMy[],String arr[][],int ch)
    {
       try{
       // System.out.println(verb.length);
        for(int y=0;y<verb.length;y++)
for(int z=0;z<5;z++)
{
    if(verb[y][z]!=null)
if(inputMy[inputMy.length-2].equalsIgnoreCase(verb[y][z])) //if the last word of the question matches
{ //any word in verb[][]
    
counter1=1; // counter1 is set equal to 1
c6=inputMy.length-2; //c6 is assigned the index of the last verb
} 

}

if(counter1==0) //if any verb of question matches 
{
for(int y=0;y<verb.length;y++) //with any word of verb[][]
for(int z=0;z<5;z++)
{  if(verb[y][z]!=null)
for(int x=0;x<inputMy.length-1;x++)
{
if(inputMy[x].equalsIgnoreCase(verb[y][z])&& !inputMy[x].equalsIgnoreCase("did") && !inputMy[x].equalsIgnoreCase("was")  ) //c6 is assigned index of the verb(in the question)
    c6=x;

}

}

}



 for(int i=0;i<inputMy.length-1;i++)
 {
     if(inputMy[i].equals("ask")||inputMy[i].equals("answer")||inputMy[i].equals("answered")||inputMy[i].equals("say")||inputMy[i].equals("asking")||inputMy[i].equals("saying")|| inputMy[i].equals("tell")|| inputMy[i].equals("telling")){
         
             counter4=1;
             l=i;
          }
    
    
 }

 for(int i=0;i<inputMy.length-1;i++)
 {
     if(inputMy[i].equals("before"))
     {
         counter2=1;
     }
 }
  for(int i=0;i<c6;i++)
 {
     for(int g=0;g<he.length;g++)
     if(inputMy[i].equals(he[g]))
     {
         counter3=1;
     }
     
     for(int g=0;g<she.length;g++)
     if(inputMy[i].equals(she[g]))
     {
         counter3=2;
     } 
    
 }
   
 
        
/*if(inputMy[0].equalsIgnoreCase("what"))
{
ch=1;
}
else if(inputMy[0].equalsIgnoreCase("where"))
{
ch=2;
}
else if(inputMy[0].equalsIgnoreCase("when"))
{
ch=3;
}

else if(inputMy[0].equalsIgnoreCase("who"))
{
ch=4;
}

else if(inputMy[0].equalsIgnoreCase("did")||inputMy[0].equalsIgnoreCase("whether")||inputMy[0].equalsIgnoreCase("was"))
{
ch=7;
}

*/
//System.out.print(g);
  int ch3=ch;
index1=new int[g];
switch(ch3)
{
case 1: //commnts same as where -case 2
    //System.out.print(l);

     //System.out.print(q);
  if(inputMy[0].equalsIgnoreCase("what"))
   {
    
    
    if(counter4==1)    //say
{
        

for(int k=0;k<g;k++)
{                   // quotes wale stmts ko 1 krta hai
    for(int j=0;j<max;j++){
        if(arr[k][j]!=null )
        if(arr[k][j].equals("\""))
        {
            index1[k]=1;
        }
    }
}

for(int mx=0;mx<g;mx++)
{
count7=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
   
if(!inputMy[v].equalsIgnoreCase("are")&&!inputMy[v].equalsIgnoreCase("the")&&!inputMy[v].equalsIgnoreCase("is")&&!inputMy[v].equalsIgnoreCase("a")&&!inputMy[v].equalsIgnoreCase("and")&&!inputMy[v].equalsIgnoreCase("said"))
if(inputMy[v].equalsIgnoreCase(arr[mx][n]))
{
count7++;
}
}

}
if(countMax1<count7)
{
countMax1=count7;
index7=mx;

}
}
//System.out.println(index7);

   for(int j=0;j<he.length-2;j++)
     if(inputMy[l-1].equalsIgnoreCase(he[j]))
     {
         q=1;
         actor=j;
     }
     
     for(int j=0;j<she.length-1;j++)
     if(inputMy[l-1].equalsIgnoreCase(she[j]))
     {
         q=2;
         actor=j;
     }  
 
 
if(q==1)
    if(counter2==1)  //b4
    {
       
       
    b: for(int r=index7;r>=0;r--)
{
    if(index1[r]==1)
    {
       
       count6=0;
              

        for(int k=0;k<max;k++)
            if(arr[r][k]!=null)
            {
                
                if(arr[r][k].equals("\""))
                      {
                          
                         count6++;
                         
                     }
                
                if((count6%2)==0)
                {
                    
                 if(arr[r][k].equalsIgnoreCase(he[actor])||arr[r][k].equalsIgnoreCase("he"))
                 {
                    
                     for(int k1=0;k1<max;k1++)
                     { if(arr[r][k1]!=null)
                         System.out.print(arr[r][k1]+" ");
                     }                            
                      break b;
 
                 }
                 
                
                }
               
                
            }
    }
}    
    }
    else  //after n when n normal
    {
    b: for(int r=index7;r<index1.length;r++)
{
    if(index1[r]==1)
    {
       count6=0;
        for(int k=0;k<max;k++)
            if(arr[r][k]!=null)
            {
                
                 if(count6%2==0)
                {
                if(arr[r][k].equalsIgnoreCase(he[actor])||arr[r][k].equalsIgnoreCase("he"))
                 {
                     for(int k1=0;k1<max;k1++)
                         if(arr[r][k1]!=null)
                            System.out.print(arr[r][k1]+" ");
                     break b;
                 }
                
                }
               else if(arr[r][k].equals("\""))
                      {
                         count6++;
                         
                     }
                
            }
    }
}
    }
if(q==2)
    if(counter2==1)
    {
        
    b: for(int r=index7;r>=0;r--)
{
    if(index1[r]==1)
    {
       count6=0;
        for(int k=0;k<max;k++)
            if(arr[r][k]!=null)
            {
                
                if(count6%2==0)
                {
                 if(arr[r][k].equalsIgnoreCase(she[actor])||arr[r][k].equalsIgnoreCase("she"))
                 {
                     for(int k1=0;k1<max;k1++)
                         if(arr[r][k1]!=null)
                            System.out.print(arr[r][k1]+" ");
                     break b;
                 }
                
                }
             if(arr[r][k].equals("\""))
                      {
                         count6++;
                         
                     }
                
            }
    }
}    
    }
else
    {
    b: for(int r=index7;r<index1.length;r++)
{
    if(index1[r]==1)
    {
       count6=0;
        for(int k=0;k<max;k++)
            if(arr[r][k]!=null)
            {
                
                if(count6%2==0)
                {
                 if(arr[r][k].equalsIgnoreCase(she[actor])||arr[r][k].equalsIgnoreCase("she"))
                 {
                     for(int k1=0;k1<max;k1++)
                         if(arr[r][k1]!=null)
                            System.out.print(arr[r][k1]+" ");
                     break b;
                 }
                
                }
               else if(arr[r][k].equals("\""))
                      {
                         count6++;
                         
                     }
                
            }
    }
}
    }
      

    }
else {

 for(int i=2;i<c6;i++) //omits the first two words of the qn n prints upto the verb 
{
System.out.print(inputMy[i]+" " );
}

for(int j=0;j<verb.length;j++)
for(int k=0;k<5;k++)
{if(verb[j][k]!=null)
if(inputMy[c6].equalsIgnoreCase(verb[j][k]))
{

temp=j;
}
}

//System.out.print(verb[temp][0]+"gdfh");

for(int i=0;i<g;i++)
for(int j=0;j<max;j++)
{if(arr[i][j]!=null)

if(verb[temp][0].equalsIgnoreCase(arr[i][j]))
{
index1[i]=1;

}

}
    
/* for(int i=0;i<g;i++)
System.out.print(index1[i]);
*/

for(int i=0;i<inputMy.length;i++)
{
for(int j=0;j<he.length;j++)
     if(inputMy[i].equalsIgnoreCase(he[j]))
     {
         q=1;
         actor=j;
     }
     
     for(int j=0;j<she.length;j++)
     if(inputMy[i].equalsIgnoreCase(she[j]))
     {
         q=2;
         actor=j;
     } 
}   

if(q==1)
for(int i=0;i<g;i++)
{
if(index1[i]==1)
{
int j=0;
while(!arr[i][j].equalsIgnoreCase(verb[temp][0]))
{
if(arr[i][j]!=null)
for(int k=0;k<she.length;k++)
if(  arr[i][j].equalsIgnoreCase(she[k]))
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
  for(int k=0;k<he.length;k++)
if(  arr[i][j].equalsIgnoreCase(he[k])&& k!=actor && k!=he.length-1 && k!=he.length-2 && k!=he.length-3)
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
j++;
}
}
}


else if(q==2)
for(int i=0;i<g;i++)
{
if(index1[i]==1)
{
int j=0;
while(!arr[i][j].equalsIgnoreCase(verb[temp][0]))
{
if(arr[i][j]!=null)
for(int k=0;k<he.length;k++)
if(  arr[i][j].equalsIgnoreCase(he[k]))
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
  for(int k=0;k<she.length;k++)
if(  arr[i][j].equalsIgnoreCase(she[k])&& k!=actor && k!=she.length-1 && k!=she.length-2)
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
j++;
}

}
}

for(int i=0;i<g;i++)
{
if(index1[i]==1)
counter++;
}
int e=0;

for(e=0;e<5;e++)
if(verb[temp][e].equalsIgnoreCase(inputMy[c6]))
{
break;
}
if(e==1 || e==2 || e==0 || e==4)
{
System.out.print(verb[temp][2]+" ");
}
if(e==3)
{
System.out.print(verb[temp][3]+" ");
}
        

if(counter>1)
{
  
for(int m=0;m<g;m++)
{
count=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
    if(arr[m][n]!=null)
if(index1[m]==1)
if(!inputMy[v].equalsIgnoreCase("the")&&!inputMy[v].equalsIgnoreCase("are")&&!inputMy[v].equalsIgnoreCase("is")&&!inputMy[v].equalsIgnoreCase("a")&&!inputMy[v].equalsIgnoreCase("and"))
if(inputMy[v].equalsIgnoreCase(arr[m][n]))
{
count++;
}
}

}
if(countMax<count)
{
countMax=count;
index=m;
}
}

int j=0;
for(j=0;j<max;j++)
{
if(arr[index][j]!=null)
if(arr[index][j].equalsIgnoreCase(verb[temp][0]))
{
break;
}
}
for(int k=j+1;k<max;k++)
{
if(arr[index][k]!=null)
System.out.print(arr[index][k]+" ");

}






}
else if(counter==1)
{
for(int n=0;n<g;n++)
{
if(index1[n]==1)
temp1=n;
}



int j=0;
for(j=0;j<max;j++)
{
if(arr[temp1][j].equalsIgnoreCase(verb[temp][0]))
{
break;
}
}

for(int k=j+1;k<max;k++)
{
if(arr[temp1][k]!=null)
System.out.print(arr[temp1][k]+" ");

}
}


//comments same as where -case 2

/* for(int m=0;m<g;m++)
{
count=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
if(!inputMy[v].equalsIgnoreCase("the")||!inputMy[v].equalsIgnoreCase("are")||!inputMy[v].equalsIgnoreCase("is")||!inputMy[v].equalsIgnoreCase("a")||!inputMy[v].equalsIgnoreCase("and"))
if(inputMy[v].equalsIgnoreCase(arr[m][n]))
{
count++;
}
}

}
if(countMax<count)
{
countMax=count;
index=m;
}


}
System.out.println("Answer :");
if(countMax==0)
{
System.out.println("Sorry unable to answer the question. ");
}
else
{
for(int n=0;n<max;n++)
{
if(arr[index][n]!=null)
System.out.print(arr[index][n]+" ");
}
}
*/
    }
    
    }
 else
        System.out.println("You entered the wrong question");
break;
case 2:
     if(inputMy[0].equalsIgnoreCase("where"))
   {
     for(int i=2;i<c6;i++) //omits the first two words of the qn n prints upto the verb 
{
System.out.print(inputMy[i]+" " );
}
/*if(counter1==1) //checks whether last word of question is a verb
{ //that is present in verb[][]

for(int i=2;i<(inputMy.length-2);i++) 
{
System.out.print(inputMy[i]+" " ); //omits the first two words and the last word(verb)
} //of the question and prints the remaining words 
}
else if(counter1==0)
{ //if the last word is not a verb
for(int i=2;i<c6;i++) //omits the first two words of the qn n prints upto the verb 
{
System.out.print(inputMy[i]+" " );
}
}*/
    // System.out.print(g+" "+max);
for(int j=0;j<verb.length;j++)
for(int k=0;k<5;k++)
{
if(inputMy[(c6)].equalsIgnoreCase(verb[j][k]))
{ //if there11 is a verb 

temp=j; //then assigns the row no. of the verb in verb[][] to temp
}
}
 //System.out.print(verb[temp][0]);

for(int i1=0;i1<g;i1++)
for(int j=0;j<max;j++)
{


if(verb[temp][0].equalsIgnoreCase(arr[i1][j]))
{
index1[i1]=1;

}

}
/*
 for(int i=0;i<g;i++)
System.out.print(index1[i]);
*/

for(int i=0;i<c6;i++)
{
    for(int j=0;j<he.length-2;j++)
if(inputMy[i].equalsIgnoreCase(he[j]))
{
q=1;
actor=j;
//if question contains woodcutter or 'he' then q is assigned a value of 1
}
    
    for(int j=0;j<she.length-1;j++)
if(inputMy[i].equalsIgnoreCase(she[j]))
{
q=2;//if question contains fairy or 'she' then q is assigned a value of 1
actor=j;
}
}
//System.out.print(actor+"   "+q);


if(q==1) //if q is 1
for(int i=0;i<g;i++)
{
if(index1[i]==1) //and if any of the the sentences frm the passage contains the verb
{
int j=0;

while(!arr[i][j].equalsIgnoreCase(verb[temp][0])) //the while loop terminates when it reaches the verb i
{
if(arr[i][j]!=null)
   for(int k=0;k<she.length;k++)
if(  arr[i][j].equalsIgnoreCase(she[k]))
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
  for(int k=0;k<he.length;k++)
if(  arr[i][j].equalsIgnoreCase(he[k])&& k!=actor && k!=he.length-1 && k!=he.length-2 && k!=he.length-3 )
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
j++;
}
}
}


else if(q==2) //same as above for the questions containing fairy or she 
for(int i=0;i<g;i++)
{
if(index1[i]==1)
{
int j=0;
while(!arr[i][j].equalsIgnoreCase(verb[temp][0]))
{
if(arr[i][j]!=null)
 for(int k=0;k<he.length;k++)
if(  arr[i][j].equalsIgnoreCase(he[k]))
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
  for(int k=0;k<she.length;k++)
if(  arr[i][j].equalsIgnoreCase(she[k])&& k!=actor && k!=she.length-1 && k!=she.length-2)
{
index1[i]=0; //when the question is about woodcutter the index1[] of all the sentences containing fairy or she is assigned 0
}
j++;
}

}
}

for(int i=0;i<g;i++)
{
if(index1[i]==1) // counter denotes the no. of sentences containing the verb
counter++;
}
if(counter>1) // if more than one sentence contains the verb(that is more than one element of index1[] is 1)
{
for(int m=0;m<g;m++)
{
count=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
if(index1[m]==1)
if(!inputMy[v].equalsIgnoreCase("the")&&!inputMy[v].equalsIgnoreCase("are")&&!inputMy[v].equalsIgnoreCase("is")&&!inputMy[v].equalsIgnoreCase("a")&&!inputMy[v].equalsIgnoreCase("and"))
if(inputMy[v].equalsIgnoreCase(arr[m][n]))
{
count++;
}
}

}
if(countMax<count)
{
countMax=count;
index=m; //index gives the row number of the sentence containing max matching keywords
}
int i=0;

for(i=0;i<verb[temp].length;i++)
if(verb[temp][i].equalsIgnoreCase(inputMy[c6])) //finds outs the verb is present in which column of the given row of verb[][]
{
break;
}
if(i==1 || i==2 || i==0 || i==4) //if the verb is in the 1st column or present ,past column
{
System.out.print(verb[temp][2]+" "); //the corresponding verb in the past form is printed
}
if(i==3) //if the verb is in the last column(future tense)
{
System.out.print(verb[temp][3]+" "); //the corresponding verb in the future form is printed
}
int j=0;
for(j=0;j<max;j++)
{if(arr[index][j]!=null)
if(arr[index][j].equalsIgnoreCase(verb[temp][0]))
{
break;
}
}
for(int k=j+1;k<max;k++)
{
if(arr[index][k]!=null)
System.out.print(arr[index][k]+" "); // prints the part of the sentence after the verb

}


}//why this brace of for(m=0 blah blah ) is ending here ? :O



}
else if(counter==1) //if only one sentence contains the verb in the question 
{
for(int n=0;n<g;n++)
{
if(index1[n]==1) //n is the row number of the sentence that contains the verb
temp1=n; //temp1 is assigned n
}
int i=0;
for(i=0;i<5;i++)
if(verb[temp][i].equalsIgnoreCase(inputMy[c6]))
{ //finds outs the verb is present in which column of the given row of verb[][]
break;
}
if(i==1 || i==2 || i==0 || i==4) //if the verb is in the 1st column or present ,past column
{
System.out.print(verb[temp][2]+" "); //the corresponding verb in the past form is printed
}
if(i==3) //if the verb is in the last column(future tense)
{
System.out.print(verb[temp][3]+" "); //the corresponding verb in the future form is printed
}
int j=0;
for(j=0;j<max;j++)
{
if(arr[temp1][j].equalsIgnoreCase(verb[temp][0])) //finds j which gives postion of the verb in the sentence indexed by temp1(row)
{
break;
}
}
for(int k=j+1;k<max;k++)
{
if(arr[temp1][k]!=null) //prints the remaining part of the sentence after the verb
System.out.print(arr[temp1][k]+" ");

}
}





















/* for(int m=0;m<g;m++)
{
count=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
if(!inputMy[v].equalsIgnoreCase("the")||!inputMy[v].equalsIgnoreCase("are")||!inputMy[v].equalsIgnoreCase("is")||!inputMy[v].equalsIgnoreCase("a")||!inputMy[v].equalsIgnoreCase("and"))
if(inputMy[v].equalsIgnoreCase(arr[m][n]))
{
count++;
}
}

}
if(countMax<count)
{
countMax=count;
index=m;
}


}
System.out.println("Answer :");
if(countMax==0)
{
System.out.println("Sorry unable to answer the question.");
}
else
{
for(int n=0;n<max;n++)
{
if(arr[index][n]!=null)
System.out.print(arr[index][n]+" ");
}


}*/
}
 else
        System.out.println("You entered the wrong question");
    break;
    
    
case 3:
       //System.out.print(c6);
   if(inputMy[0].equalsIgnoreCase("when"))
   {
 for(int m=0;m<g;m++)
{
count=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
if(!inputMy[v].equalsIgnoreCase("the")&&!inputMy[v].equalsIgnoreCase("are")&&!inputMy[v].equalsIgnoreCase("is")&&!inputMy[v].equalsIgnoreCase("a")&&!inputMy[v].equalsIgnoreCase("and"))
if(inputMy[v].equalsIgnoreCase(arr[m][n]))
{
count++;
}
}

}
if(countMax<count)
{
countMax=count;
index=m;
}


}
 if(index!=0)
 {
     
     
     int truck=0;
 for(int i=2;i<c6;i++)
    {
        System.out.print(inputMy[i]+" ");
    }
    
       for(int j=0;j<verb.length;j++)
for(int k=0;k<5;k++)
{
if(inputMy[(c6)].equalsIgnoreCase(verb[j][k]))
{ //if the last word is a verb 

temp=j; //then assigns the row no. of the verb in verb[][] to temp
}
}
        if(inputMy[1].equalsIgnoreCase("did"))
    {
        
    }
    else 
    {
       System.out.print(inputMy[1]+" ");  
    }
       int i1=0;
    for(i1=0;i1<4;i1++)
if(verb[temp][i1].equals(inputMy[c6])) //finds outs the verb is present in which column of the given row of verb[][]
{
break;
}
if(i1==1 || i1==2 || i1==0 || i1==4) //if the verb is in the 1st column or present ,past column
{
System.out.print(verb[temp][2]+" "); //the corresponding verb in the past form is printed
}
if(i1==3) //if the verb is in the last column(future tense)
{
System.out.print(verb[temp][3]+" "); //the corresponding verb in the future form is printed
}
    
 for(int i=c6+1;i<inputMy.length-1;i++)
 {
    System.out.print(inputMy[i]+" "); 
 }
  System.out.print("when "); 

     
     
     
     
     
     
 int countern =0,countern1=0;

 for(int i=0;i<max;i++)
     if(arr[index-1][i]!=null)

     if(arr[index-1][i].equalsIgnoreCase("\""))
countern=1;
 if(countern==1)
 {
         count6=0;
        for(int k=0;k<max;k++)
            if(arr[index-1][k]!=null)
            {
                
                if(count6%2==0)
                {
                    for(int t=0;t<she.length-2;t++)
                 if(arr[index-1][k].equalsIgnoreCase(she[t])||arr[index-1][k].equalsIgnoreCase(she[she.length-1]))
                 {
                    countern1=1;
                    actor=t;
                 }
                 for(int t=0;t<he.length-3;t++)
                 if(arr[index-1][k].equalsIgnoreCase(he[t])||arr[index-1][k].equalsIgnoreCase(he[he.length-1]))
                 {
                    countern1=2;
                    actor=t;
                 }
                
                }
             if(arr[index-1][k].equals("\""))
                      {
                         count6++;
                         
                     }
                
            }
        
            if(countern1==1)
                System.out.print(she[actor]+" said ");
             if(countern1==2)
                System.out.print(he[actor]+" said ");
count6=0;
 for(int i=0;i<max;i++)
                 
 {
     if(arr[index-1][i]!=null)
     {
     if(arr[index-1][i].equalsIgnoreCase("\""))
     {
         count6++;
         System.out.print("\"");
     }
     else if(count6%2!=0)
     {
        System.out.print(arr[index-1][i]+" ");         
     }
         }
 }
 
 } 
 else 
 {
     int q=0;
      for(int j=0;j<he.length-3;j++)
          for(int y=0;y<inputMy.length-1;y++)
     if(inputMy[y].equals(he[j]))
     {
         q=2;
         actor=j;
     }
      
     for(int j=0;j<she.length-2;j++)
         for(int y=0;y<inputMy.length-1;y++)
     if(inputMy[y].equals(she[j]))
     {
         q=1;
         actor=j;
     }  
 if(q==1)
 {
     for(int i=0;i<max;i++)
     {
         if(arr[index-1][i]!=null)

         if(arr[index-1][i].equalsIgnoreCase(she[actor]))
         {
             System.out.print("she ");
         }
        /* else
         {
             if(arr[index-1][i].equalsIgnoreCase("he"))
         {
             System.out.print("woodcutter ");
         } */
             else
             System.out.print(arr[index-1][i]+" ");
             
         }
     }
     
     
 
 else
 {
     for(int i=0;i<max;i++)
     {
         if(arr[index-1][i]!=null)

         if(arr[index-1][i].equalsIgnoreCase(he[actor]))
         {
             System.out.print("he ");
         }
        /* else
         {
             if(arr[index-1][i].equalsIgnoreCase("she"))
         {
             System.out.print("fairy ");
         }*/
             else
             System.out.print(arr[index-1][i]+" ");
             
         
     }
     
     
 }
 
 
 
 
 
 
 }
}
 else
 {
     System.out.println();
     for(int t50=0;t50<max;t50++)
         if(arr[index][t50]!=null)
     System.out.print(arr[index][t50]+" ");
 }
   /*     
         for(int r=0;r<max;r++)
{

        
            if(arr[index-1][r]!=null)
            {
                
                if(arr[index-1][r].equals("\""))
                      {
                          if(c==0)
                          System.out.print()
                        System.out.print("\" ");
                         count6++;
                         c++;
                         
                     }
                if(count6%2!=0)
                {
                  if(arr[index-1][r].equalsIgnoreCase("fairy")||arr[index-1][r].equalsIgnoreCase("she"))
                 {
                        
                         
                 }
                
                }
           
               
                
            }
    
}
    

if(countMax==0)
{
System.out.println("Sorry unable to answer the question.");
}
else
{
for(int n=0;n<max;n++)
{
    if(index!=0)
    {
        if(arr[index-1][n]!=null)
            System.out.print(arr[index-1][n]+" ");
    }
    else
    { 
        if(arr[index][n]!=null)
         System.out.print(arr[index][n]+" ");
    }
    
}
} */
}
 else
        System.out.println("You entered the wrong question");
    break;
    
    
case 4:
    if(inputMy[0].equalsIgnoreCase("who")||inputMy[0].equalsIgnoreCase("whom"))
    {
    
        String gujju=null;
    
    int ww=0;
    c:  for(int i=0;i<inputMy.length;i++)
     {
         for(int j=0;j<he.length;j++)
         {
             if(inputMy[i].equalsIgnoreCase(he[j])&& !(inputMy[i].equalsIgnoreCase("his")))
             {  gujju=he[j];
             ww=1;
             break c;
             }
              }
         for(int j=0;j<she.length;j++)
         {
             if(inputMy[i].equalsIgnoreCase(she[j]))
             { gujju=she[j];
             ww=2;
             break c;
             }
         }
     }
   if(he.length+she.length==7 && gujju!=null)
   {
   if(ww==1 && she.length==2)
   {
       if(he[1].equalsIgnoreCase(gujju))
       System.out.print(he[0]+" ");
       else
           System.out.print(he[1]+" ");
       
   }
   
   if(ww==1 && she.length==3)
   {
       
       System.out.print(she[0]+" ");
       
   }
   if(ww==2 && he.length==3)
   {
       if(she[1].equalsIgnoreCase(gujju))
       System.out.print(she[0]+" ");
       else
           System.out.print(she[1]+" ");
       
   }
   if(ww==2 && he.length==4)
   {
      
       System.out.print(he[0]+" ");
       
   }
   } 
    else
   {
     
       for(int j=0;j<verb.length;j++)
for(int k=0;k<5;k++)
{
    if(verb[j][k]!=null)
if(inputMy[(c6)].equalsIgnoreCase(verb[j][k]))
{ //if there is a verb 
//System.out.print(inputMy[c6]);
temp=j; //then assigns the row no. of the verb in verb[][] to temp
}
}
 //System.out.print(verb[temp][0]);

for(int i2=0;i2<g;i2++)
for(int j=0;j<max;j++)
{

if(arr[i2][j]!=null)
if(verb[temp][0].equalsIgnoreCase(arr[i2][j]))
{
index1[i2]=1;

}

}

  
for(int i=0;i<g;i++)
{
if(index1[i]==1) // counter denotes the no. of sentences containing the verb
counter++;
}
//System.out.println(counter);
if(counter>=1) // if more than one sentence contains the verb(that is more than one element of index1[] is 1)
{
for(int m=0;m<g;m++)
{
count=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
if(index1[m]==1 && arr[m][n]!=null)
if(!inputMy[v].equalsIgnoreCase("the")&&!inputMy[v].equalsIgnoreCase("are")&&!inputMy[v].equalsIgnoreCase("is")&&!inputMy[v].equalsIgnoreCase("a")&&!inputMy[v].equalsIgnoreCase("and"))
if(inputMy[v].equalsIgnoreCase(arr[m][n]))
{
count++;
}
}

}
if(countMax<count)
{
countMax=count;
index=m; //index gives the row number of the sentence containing max matching keywords
}     
    
}

   }
//System.out.println(verb[temp][0]);
//System.out.println(index);

int jupiter=0,jupiter10=0,jupiter1=0,minimum1=max+1,minimum2=max+1,minimum=max+1,minimum3=max+1;
String pluto=null,jupiter2=null,jupiter3=null;
for(int i =0;i<max;i++)
{
    if(arr[index][i]!=null)
    if(verb[temp][0].equalsIgnoreCase(arr[index][i]))
    {
        jupiter=i;
        break;
    }
}

for(int i=0;i<max;i++)
{
    //System.out.println("hahahahahahaha");
    for(int j=0;j<he.length;j++)
        if(arr[index][i]!=null)
   if(arr[index][i].equalsIgnoreCase(he[j])) 
   {
    // System.out.println(he[j]);
   minimum=Math.abs(jupiter-i);
   if(minimum<minimum1)
   {
       minimum1=minimum;
       jupiter2=he[j];
       //System.out.println(jupiter2);
       jupiter10=i;
             
   // System.out.println(jupiter2);

   }
   }
    for(int j=0;j<she.length;j++)
                if(arr[index][i]!=null)
   if(arr[index][i].equalsIgnoreCase(she[j])) 
   {
     
   minimum3=Math.abs(jupiter-i);
   if(minimum3<minimum2)
   {
       minimum2=minimum3;
       jupiter3=she[j];
       jupiter1=i;
      
    //System.out.println(jupiter3);

   }
   }
}
    if(minimum1<minimum2)
    {
        
        
        pluto=jupiter2;
        
    //System.out.println(pluto);

        if(pluto.equalsIgnoreCase("he")||pluto.equalsIgnoreCase("him")||pluto.equalsIgnoreCase("his"))
        {
            for(int s =jupiter10;s>=0;s--)
    {
        for(int q1=0;q1<he.length-2;q1++)
        {if(arr[index][s]!=null)
            if(arr[index][s].equalsIgnoreCase(he[q1]))
            {
                pluto=he[q1];
            }
        }
        
    }
      if(pluto.equalsIgnoreCase("he")||pluto.equalsIgnoreCase("him")||pluto.equalsIgnoreCase("his"))
      {
        for(int q2=index-1;q2>=0;q2--)
          for(int s =max-1;s>=0;s--)
    {
        if(arr[q2][s]!=null)
        {
            for(int w=0;w<he.length-2;w++)
        {
            if(arr[q2][s].equalsIgnoreCase(he[w]))
            {
                pluto=he[w];
            }
        }
        
        }
    }
      
      }   
        }
    }
    else
    {
       
        pluto=jupiter3;
        if(pluto!=null) 
  if(pluto.equalsIgnoreCase("she")|| pluto.equalsIgnoreCase("her"))
       
  {
          for(int s =jupiter1;s>=0;s--)
    {
        for(int q3=0;q3<she.length-2;q3++)
        {if(arr[index][s]!=null)
            
            if(arr[index][s].equalsIgnoreCase(she[q3]))
            {
                pluto=she[q3];
            }
        }
        
    }
      if(pluto.equalsIgnoreCase("she")||pluto.equalsIgnoreCase("her"))
      {
        for(int q4=index-1;q4>=0;q4--)
          for(int s =max-1;s>=0;s--)
    {
        if(arr[q4][s]!=null)
        {
            for(int w=0;w<she.length-2;w++)
        {
            if(arr[q4][s].equalsIgnoreCase(she[w]))
            {
                pluto=she[w];
            }
        }
        
        }
    }
      
      }   
        }    
        
    }


    System.out.print(pluto+" ");


   }
   for(int i =1;i<inputMy.length-1;i++)
       System.out.print(inputMy[i]+" ");
   System.out.print(".");

}
 else
        System.out.println("You entered the wrong question");
break;
   
    case 5:
        
    if(inputMy[0].equalsIgnoreCase("did")||inputMy[0].equalsIgnoreCase("whether")||inputMy[0].equalsIgnoreCase("was"))
    {
    int r=0;
    if(counter4!=1)
{
    int sun=0;

z:for(int y=0;y<verb.length;y++) //with any word of verb[][]
    for(int z=0;z<5;z++)
    {
    if(verb[y][z].equalsIgnoreCase(inputMy[c6])) //verb array me verb ka pos
    {  sun=y;
       break z; 
    }
    
    
    }
    int moon=0;
    q:  for(int m=0;m<g;m++)
        for(int n=0;n<max;n++)
        {
           if(verb[sun][0].equalsIgnoreCase(arr[m][n])) 
           {
               moon=m;   //passage me verb ka stmt
           break q;
           }
        }
    int p=0;
    int p1=0;
 int max1[]=new int[max];  
 int no1[]=new int[max];  
  for(int i=0;i<max;i++)
  {
      for(int y=0;y<verb.length;y++)
      {
for(int z=0;z<5;z++)
{
    if(arr[moon][i]!=null)
       {
           if(arr[moon][i].equalsIgnoreCase(verb[y][z]))
           {
               max1[p]=i;  //stmt me verb ka pos
               p++; // no of verbs in passage stmt
           }
    }
}
      }
  }
   for(int i=0;i<max;i++)
  {
      if(arr[moon][i]!=null)
       {
           if(arr[moon][i].equalsIgnoreCase("no")||arr[moon][i].equalsIgnoreCase("not")||arr[moon][i].equalsIgnoreCase("didn't")||arr[moon][i].equalsIgnoreCase("refused")||arr[moon][i].equalsIgnoreCase("refuse"))
           {
               no1[p1]=i;  //stmt me verb ka pos
               p1++; // no of -ve verbs in passage stmt
           }
    }
  }
  int wl=0;
   int verb1[]=new int [p];
   int verb2[]=new int [p1];
   
   for(int i=0;i<p1;i++)
   {
       for(int j=0;j<p;j++)
       {
           verb1[j]=Math.abs(no1[i]-max1[j]);
           
       }
for(int w=1;w<p;w++)
{
    if(verb1[w]<=verb1[w-1])
    {
        wl=w;
    }
}
      verb2[i]=max1[wl];
   }
   
  int star=0;
  int planet=0;
  
  
  for(int i=0;i<c6;i++)  
   if(inputMy[i].equalsIgnoreCase("no")||inputMy[i].equalsIgnoreCase("not")||inputMy[i].equalsIgnoreCase("didn't"))
   {
       star=1;      
   
   break;
   
   }    
    
    
    if(star==0)
    {
        for(int k=0;k<p1;k++)
        if(verb[sun][0].equals(arr[moon][verb2[k]]))
           planet=1;
        if(planet==1)
           System.out.println("no");    
        else
           System.out.println("yes");  
    }
    
    
    else
    {
       for(int k=0;k<p1;k++)
        if(verb[sun][0].equals(arr[moon][verb2[k]]))
           planet=1;
        if(planet==1)
           System.out.println("yes");    
        else
           System.out.println("no"); 
    }
    
} 
   
  else if(counter4==1)  
  {
      
     int mars=0,counter44=0;
      int position=0;
       for(int i=0;i<inputMy.length;i++)
       {
           if(inputMy[i].equals("say")||inputMy[i].equals("tell"))
           {
               mars=1;
               position=i;
               
           }
       }
        if(inputMy[position-1].equalsIgnoreCase("no")||inputMy[position-1].equalsIgnoreCase("not")||inputMy[position-1].equalsIgnoreCase("didn't"))
        {
            counter44=1;
        }
      
      for(int k=0;k<g;k++)
{                   // quotes wale stmts ko 1 krta hai
    for(int j=0;j<max;j++){
        if(arr[k][j]!=null  )
        if(arr[k][j].equals("\""))
        {
            index1[k]=1;
        }
    }
}

      
      for(int mx=0;mx<g;mx++)
{
count7=0;
for(int n=0;n<max;n++)
{
for(int v=0;v<inputMy.length;v++)
{
    if(index1[mx]==1)
if(!inputMy[v].equalsIgnoreCase("are")&&!inputMy[v].equalsIgnoreCase("the")&&!inputMy[v].equalsIgnoreCase("is")&&!inputMy[v].equalsIgnoreCase("a")&&!inputMy[v].equalsIgnoreCase("and")&&!inputMy[v].equalsIgnoreCase("said"))
if(inputMy[v].equalsIgnoreCase(arr[mx][n]))
{
count7++;
}
}

}
if(countMax1<count7)
{
countMax1=count7;
r=mx;

}
}
      
      
      
     
      
     for(int i=0;i<g;i++) 
      for(int j=0;j<max;j++) 
      {
          if(index1[r]==1)
    {
        count6=0;
              

        for(int k=0;k<max;k++)
            if(arr[r][k]!=null)
            {
                
                if(arr[r][k].equals("\""))
                      {
                          
                         count6++;
                         
                     }
                
                if((count6%2)==0)
                {
                    for(int u=0;u<he.length-3;u++)
                 if(arr[r][k].equalsIgnoreCase(he[u])||arr[r][k].equalsIgnoreCase("he"))
                 {
                        r1=1; 
                        
                  }
                    for(int u=0;u<she.length-2;u++)
                 if(arr[r][k].equalsIgnoreCase(she[u])||arr[r][k].equalsIgnoreCase("she"))
                 {
                        r2=1;                     
                  }
                 }
               
                
            }
    }
          
      }
      
     
    for(int u=0;u<he.length-3;u++)
    {
        for(int i=0;i<c6;i++)
        if(inputMy[i].equalsIgnoreCase(he[u]))
        {
            actor=u;
        }
    }
     
    for(int u=0;u<she.length-2;u++)
    {
        for(int i=0;i<c6;i++)
        if(inputMy[i].equalsIgnoreCase(she[u]))
        {
            actor=u;
        }
    }
     
     
     
     
      for(int i=0;i<c6;i++)
      {
          
          if(inputMy[i].equalsIgnoreCase(he[actor])|| inputMy[i].equalsIgnoreCase("he"))
          {
              r3=2;
              if(r1==1 )
              {
                  if(counter44==0)
                  {
                      r3=1;
                  System.out.println("yes");
                  break;
              }
                  else if(counter44==1)
                  {
                      r3=1;
                      System.out.println("no");
                  }
              }
              else if(r2==1)
              {
                  if(counter44==0)
                  {
                    r3=1;
                  System.out.println("no");
                  break;
              }
                  else if(counter44==1)
                  {
                      r3=1;
                      System.out.println("yes");
                  }
              }
              
          }
                  
         else if(inputMy[i].equalsIgnoreCase(she[actor])|| inputMy[i].equalsIgnoreCase("she"))
          {
              r3=2;
               if(r2==1)
              {
                  if(counter44==0)
                  {
                    r3=1;
                  System.out.println("yes");
                  break;
              }
                  else if(counter44==1)
                  {
                      r3=1;
                      System.out.println("no");
                  }
              }
               else if(r1==1)
              {
                  if(counter44==0)
                  {
                    r3=1;
                  System.out.println("no");
                  break;
              }
                  else if(counter44==1)
                  {
                      r3=1;
                      System.out.println("yes");
                  }
              }
               
              
               
          }
          
      }
  if(r3==2 && r3!=1)
      System.out.println("no");
  }
    }
    else
    {
        System.out.println("you entered the wrong question");
    }
        break;
    
}

    } catch(Exception e)
    {
        System.out.println();
       
        System.out.println("Unable to answer");
        
    }
   
    }
    
public static void main(String args[]) throws Exception
  {
      Scanner src=new Scanner(System.in);
      int ch=0;
      Dynamicedited z= new Dynamicedited();
      
      z.words14();
      do
      {
           System.out.println();
          System.out.println();
 System.out.println("Choose the type of Question you would like to ask");
         System.out.println("1:What");
          System.out.println("2:Where");
          System.out.println("3:When");
          System.out.println("4:Who");
          System.out.println("5:Did/Whether/Was");
          System.out.println("6:Exit");
          ch=src.nextInt();
 if(ch==0||ch>6)
 {
     System.out.println();
     System.out.println("You entered the Wrong Choice.");
     System.out.println();
      System.out.println();
 }
 else if(ch!=6){ 
     String inputMy[]=z.question14();
      
      z.compare14(inputMy, arr,ch);
 } 
      }while(ch!=6);
  }
}
