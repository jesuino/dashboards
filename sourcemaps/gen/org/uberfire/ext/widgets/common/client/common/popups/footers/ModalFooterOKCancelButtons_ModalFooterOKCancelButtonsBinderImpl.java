// .ui.xml template last modified: 1657649676978
package org.uberfire.ext.widgets.common.client.common.popups.footers;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons>, org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons.ModalFooterOKCancelButtonsBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onOKButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancelButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons owner) {
      this.owner = owner;
      build_i18nCommon();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle) GWT.create(org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18nCommon called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants i18nCommon;
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants get_i18nCommon() {
      return i18nCommon;
    }
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants build_i18nCommon() {
      // Creation section.
      i18nCommon = (org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants) GWT.create(org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18nCommon;
    }

    /**
     * Getter for f_FlowPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel1() {
      return build_f_FlowPanel1();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel1.add(get_okButton());
      f_FlowPanel1.add(get_cancelButton());

      return f_FlowPanel1;
    }

    /**
     * Getter for okButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_okButton() {
      return build_okButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_okButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button okButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      okButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLUS);
      okButton.setText("" + get_i18nCommon().OK() + "");
      okButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      okButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.okButton = okButton;

      return okButton;
    }

    /**
     * Getter for cancelButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_cancelButton() {
      return build_cancelButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_cancelButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button cancelButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      cancelButton.setText("" + get_i18nCommon().Cancel() + "");
      cancelButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DEFAULT);
      cancelButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.cancelButton = cancelButton;

      return cancelButton;
    }
  }
}
