package dk.skat.es.util;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Element;

import com.logica.skatutil.objectpath.OPS;
import com.logica.skatutil.objectpath.OPU;


public abstract class AbstractServiceImpl {

    private Log log = null;

    protected Log getLogger() {
        if (log == null) {
            log = LogFactory.getLog(this.getClass());
        }
        return log;
    }

    protected void handleHovedOplysninger(Object request, Object response) {
    	Object any = OPU.get(request, "kontekst.any");
    	if (any == null) return;
    	if (!(any instanceof Element)) return;
        RequestHelper.assignHovedOplysningerAttributes((Element)any);
        addKontekstToResponse(response);
    }

    protected void addKontekstToResponse(Object an_o_type) {
    	if (an_o_type != null) {
    		OPS.seti(an_o_type, "kontekst.any", null);
    		RequestHelper.addHovedOplysningerSvar(OPU.get(an_o_type, "kontekst"), an_o_type);
    	}
    }
    
    protected void addHovedOplysningerSvar(Object output, Object outDoc) {
    	if (OPU.get(output, "kontekst") == null) {
    		OPS.seti(output, "kontekst.any", null);
    	}
		RequestHelper.addHovedOplysningerSvar(OPU.get(output, "kontekst"), outDoc);
    }
    
    
    protected void addHovedOplysningerSvar1(Object output, Object outDoc,String seNumber) {
    	if (OPU.get(output, "kontekst") == null) {
    		OPS.seti(output, "kontekst.any", null);
    	}
		RequestHelper.addHovedOplysningerSvar1(OPU.get(output, "kontekst"), outDoc,seNumber);
    }
}
