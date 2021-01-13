package co.akshar.tryxo;

import android.util.Log;

public class a1forsingle {
    int valueatpos = 0;
    public int aii(int[] oxposi){

        if((((oxposi[8] == oxposi[4]) && oxposi[8] == 2) || ((oxposi[3] == oxposi[6]) && oxposi[3] == 2) || ((oxposi[1] == oxposi[2]) && oxposi[1] == 2)) & oxposi[0] ==1){
            valueatpos = 0;
        }
        else if((((oxposi[4] == oxposi[7]) && oxposi[4] == 2) || ((oxposi[0] == oxposi[2]) && oxposi[0] == 2)) & oxposi[1] ==1){
            valueatpos = 1;
        }
        else if((((oxposi[0] == oxposi[1]) && oxposi[0] == 2) || ((oxposi[6] == oxposi[4]) && oxposi[6]== 2) || ((oxposi[5] == oxposi[8]) && oxposi[5] == 2)) & oxposi[2] ==1){
            valueatpos = 2;
        }
        else if((((oxposi[0] == oxposi[6]) && oxposi[0] == 2) || ((oxposi[4] == oxposi[5]) && oxposi[4] == 2)) & oxposi[3] ==1){
            valueatpos = 3;
        }
        else if((((oxposi[6] == oxposi[2]) && oxposi[2] == 2) || ((oxposi[8] == oxposi[0]) && oxposi[8]== 2) || ((oxposi[3] == oxposi[5]) && oxposi[3] == 2) || ((oxposi[1] == oxposi[7]) && oxposi[1] == 2)) & oxposi[4] ==1){
            valueatpos = 4;
        }
        else if((((oxposi[8] == oxposi[2]) && oxposi[8] == 2) || ((oxposi[3] == oxposi[4]) && oxposi[3] == 2)) & oxposi[5] ==1){
            valueatpos = 5;
        }
        else if((((oxposi[2] == oxposi[4]) && oxposi[2] == 2) || ((oxposi[7] == oxposi[8]) && oxposi[7] == 2) || ((oxposi[0] == oxposi[3]) && oxposi[0] == 2)) & oxposi[6] ==1){
            valueatpos = 6;
        }
        else if((((oxposi[1] == oxposi[4]) && oxposi[1] == 2) || ((oxposi[6] == oxposi[8]) && oxposi[6] == 2)) & oxposi[7] ==1){
            valueatpos = 7;
        }
        else if((((oxposi[0] == oxposi[4]) && oxposi[4] == 2) || ((oxposi[2] == oxposi[5]) && oxposi[2] == 2) || ((oxposi[6] == oxposi[7]) && oxposi[6] == 2)) & oxposi[8] ==1){
            valueatpos = 8;
        }
        else if((((oxposi[8] == oxposi[4]) && oxposi[8] == 0) || ((oxposi[3] == oxposi[6]) && oxposi[3] == 0) || ((oxposi[1] == oxposi[2]) && oxposi[1] == 0)) & oxposi[0] ==1){
            valueatpos = 0;
        }
        else if((((oxposi[4] == oxposi[7]) && oxposi[4] == 0) || ((oxposi[0] == oxposi[2]) && oxposi[0] == 0)) & oxposi[1] ==1){
            valueatpos = 1;
        }
        else if((((oxposi[0] == oxposi[1]) && oxposi[0] == 0) || ((oxposi[6] == oxposi[4]) && oxposi[6]== 0) || ((oxposi[5] == oxposi[8]) && oxposi[5] == 0)) & oxposi[2] ==1){
            valueatpos = 2;
        }
        else if((((oxposi[0] == oxposi[6]) && oxposi[0] == 0) || ((oxposi[4] == oxposi[5]) && oxposi[4] == 0)) & oxposi[3] ==1){
            valueatpos = 3;
        }
        else if((((oxposi[6] == oxposi[2]) && oxposi[2] == 0) || ((oxposi[8] == oxposi[0]) && oxposi[8]== 0) || ((oxposi[3] == oxposi[5]) && oxposi[3] == 0) || ((oxposi[1] == oxposi[7]) && oxposi[1] == 0)) & oxposi[4] ==1){
            valueatpos = 4;
        }
        else if((((oxposi[8] == oxposi[2]) && oxposi[8] == 0) || ((oxposi[3] == oxposi[4]) && oxposi[3] == 0)) & oxposi[5] ==1){
            valueatpos = 5;
        }
        else if((((oxposi[2] == oxposi[4]) && oxposi[2] == 0) || ((oxposi[7] == oxposi[8]) && oxposi[7] == 0) || ((oxposi[0] == oxposi[3]) && oxposi[0] == 0)) & oxposi[6] ==1){
            valueatpos = 6;
        }
        else if((((oxposi[1] == oxposi[4]) && oxposi[1] == 0) || ((oxposi[6] == oxposi[8]) && oxposi[6] == 0)) & oxposi[7] ==1){
            valueatpos = 7;
        }
        else if((((oxposi[0] == oxposi[4]) && oxposi[4] == 0) || ((oxposi[2] == oxposi[5]) && oxposi[2] == 0) || ((oxposi[6] == oxposi[7]) && oxposi[6] == 0)) & oxposi[8] ==1){
            valueatpos = 8;
        }
        else {
            Boolean invalid = true;
            while(invalid){
                int jaa = (int) (Math.random() * 8.9);
                if(oxposi[jaa] == 1){
                    valueatpos = jaa;
                    invalid = false;
                    Log.d("val", "nidiih");
                }
            }
        }
        /**else if((oxposi[0]==1) && (oxposi[1]==1) && (oxposi[2]==1) && (oxposi[3]==1) && (oxposi[4]==1) && (oxposi[5]==1) && (oxposi[6]==1) && (oxposi[7] == 1) && (oxposi[8] == 1)){
            valueatpos = (int) Math.floor(Math.random()*8.9);
        }**/

        //Log.d("valuer", String.valueOf(valueatpos));
        return valueatpos;

    }
}
