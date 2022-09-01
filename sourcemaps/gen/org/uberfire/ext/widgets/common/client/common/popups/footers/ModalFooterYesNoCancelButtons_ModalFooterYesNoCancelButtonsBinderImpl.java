// .ui.xml template last modified: 1657649676978
package org.uberfire.ext.widgets.common.client.common.popups.footers;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons>, org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons.ModalFooterYesNoCancelButtonsBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onYesButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onNoButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancelButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons owner) {
      this.owner = owner;
      build_i18nCommon();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle) GWT.create(org.uberfire.ext.widgets.common.client.common.popups.footers.ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18nCommon called 3 times. Type: IMPORTED. Build precedence: 1.
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
      f_FlowPanel1.add(get_yesButton());
      f_FlowPanel1.add(get_noButton());
      f_FlowPanel1.add(get_cancelButton());

      return f_FlowPanel1;
    }

    /**
     * Getter for yesButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_yesButton() {
      return build_yesButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_yesButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button yesButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      yesButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLUS);
      yesButton.setText("" + get_i18nCommon().YES() + "");
      yesButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      yesButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.yesButton = yesButton;

      return yesButton;
    }

    /**
     * Getter for noButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_noButton() {
      return build_noButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_noButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button noButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      noButton.setText("" + get_i18nCommon().NO() + "");
      noButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);
      noButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.noButton = noButton;

      return noButton;
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
      cancelButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.cancelButton = cancelButton;

      return cancelButton;
    }
  }
}
