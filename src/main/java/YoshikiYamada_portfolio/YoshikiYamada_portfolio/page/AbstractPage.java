package YoshikiYamada_portfolio.YoshikiYamada_portfolio.page;

import YoshikiYamada_portfolio.YoshikiYamada_portfolio.panel.FooterPanel;
import YoshikiYamada_portfolio.YoshikiYamada_portfolio.panel.HeaderPanel;
import org.apache.wicket.markup.html.WebPage;

public class AbstractPage extends WebPage {
    public AbstractPage(){
        add(new HeaderPanel("headerPanel"));
        add(new FooterPanel("footerPanel"));
    }
}
