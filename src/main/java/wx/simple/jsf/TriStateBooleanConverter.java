package wx.simple.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "triStateBooleanConverter")
public class TriStateBooleanConverter implements Converter{

   @Override
   public Object getAsObject(FacesContext context, UIComponent component, String value) {
      if(value==null || value.equals("0")) {
         return null;
      } else {
         return value.equals("1");
      }
   }

   @Override
   public String getAsString(FacesContext context, UIComponent component, Object value) {
      return value==null?"0":(((Boolean) value)?"1":"2");
   }

}