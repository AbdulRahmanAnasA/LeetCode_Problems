bool rotateString(char* s, char* goal) {
    int n1=strlen(s);
    int n2=strlen(goal);
    

    if(n1 != n2){
        return false;
    }
    for(int i=0;i<n1;i++){

      if(strcmp(s,goal)==0){
        return true;
      }
        char last=s[0];

        for(int j=0;j<n1;j++){
            s[j]=s[j+1];
        }
        s[n1-1]=last;
        
      }
      return false;  
    }


