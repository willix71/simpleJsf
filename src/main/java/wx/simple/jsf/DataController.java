package wx.simple.jsf;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

@ManagedBean
@ViewScoped
public class DataController implements Serializable {
   private static final long serialVersionUID = 1L;

   private List<SimpleData> datas;
   
   private SimpleData selectedData;
   
   public DataController() {
      this.datas = IntStream.rangeClosed(1, 50).mapToObj(i->new SimpleData(i)).collect(Collectors.toList());
   }

   public List<SimpleData> getDatas() {
      return datas;
   }

   public SimpleData getSelectedData() {
      return selectedData;
   }

   public void setSelectedData(SimpleData selectedData) {
      this.selectedData = selectedData;
   }

   public String getName() { return "DataController"; }

   public void doNothing() {}
   
   public void clearMultiViewState() {
      FacesContext context = FacesContext.getCurrentInstance();
      String viewId = context.getViewRoot().getViewId();
      PrimeFaces.current().multiViewState().clearAll(viewId, true, this::showMessage);
   }
   
   private void showMessage(String clientId) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, clientId + " multiview state has been cleared out", null));
   }   
}
