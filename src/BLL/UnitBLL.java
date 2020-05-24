package BLL;

import DAL.Unit;
import Getway.UnitGetway;

/*author: lakshay(RA1711003030064)
*/
public class UnitBLL {
    
    UnitGetway unitGetway = new UnitGetway();
    
    public Object save(Unit unit){
        if(unitGetway.isUniqName(unit)){
            unitGetway.save(unit);
        }
        return unit;
    }

    public Object delete(Unit unit){
        if(unitGetway.isNotUse(unit)){
            unitGetway.delete(unit);
        }
        return unit;
    }
}
