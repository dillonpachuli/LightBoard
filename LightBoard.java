public class LightBoard{
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                if (Math.random() < 0.4) lights[i][j] = true;
                else lights[i][j] = false;
            }
        }
    }

    public LightBoard(boolean[][] allLights){
        lights = allLights;
    }

    public boolean evaluateLight(int row, int col){
        if (lights[row][col]){
            int lightsOn = 0;
            for (int i = 0; i < lights.length; i++){
                if (lights[i][col]) lightsOn++;
            }
            if (lightsOn % 2 == 0) return false;
        }

        if (!lights[row][col]){
            int lightsOn = 0;
            for (int i = 0; i < lights.length; i++){
                if (lights[i][col]) lightsOn++;
            }
            if (lightsOn % 3 == 0) return true;
        }

        return lights[row][col];
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < lights.length; i++){
            s += "[";
            for (int j = 0; j < lights[i].length; j++){
                if (j == lights[i].length-1) s += lights[i][j] + "] \n";
                else s += lights[i][j] + ", ";
            }
        }
        return s;
    }
}