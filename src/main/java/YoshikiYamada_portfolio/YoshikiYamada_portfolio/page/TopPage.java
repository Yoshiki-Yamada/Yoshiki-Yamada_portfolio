package YoshikiYamada_portfolio.YoshikiYamada_portfolio.page;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.wicketstuff.annotation.mount.MountPath;

@WicketHomePage
@MountPath("Top")
public class TopPage extends AbstractPage {
    public TopPage(){

        add(new Link<String>("toSignPage") {
            @Override
            public void onClick() {
                setResponsePage(SignPage.class);
            }
        });
    }
}
