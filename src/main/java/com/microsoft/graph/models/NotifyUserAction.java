package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NotifyUserAction extends DlpActionInfo implements Parsable {
    /** The actionLastModifiedDateTime property */
    private OffsetDateTime _actionLastModifiedDateTime;
    /** The emailText property */
    private String _emailText;
    /** The overrideOption property */
    private OverrideOption _overrideOption;
    /** The policyTip property */
    private String _policyTip;
    /** The recipients property */
    private java.util.List<String> _recipients;
    /**
     * Instantiates a new NotifyUserAction and sets the default values.
     * @return a void
     */
    public NotifyUserAction() {
        super();
        this.setOdataType("#microsoft.graph.notifyUserAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NotifyUserAction
     */
    @javax.annotation.Nonnull
    public static NotifyUserAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotifyUserAction();
    }
    /**
     * Gets the actionLastModifiedDateTime property value. The actionLastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActionLastModifiedDateTime() {
        return this._actionLastModifiedDateTime;
    }
    /**
     * Gets the emailText property value. The emailText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailText() {
        return this._emailText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NotifyUserAction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("actionLastModifiedDateTime", (n) -> { currentObject.setActionLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("emailText", (n) -> { currentObject.setEmailText(n.getStringValue()); });
            this.put("overrideOption", (n) -> { currentObject.setOverrideOption(n.getEnumValue(OverrideOption.class)); });
            this.put("policyTip", (n) -> { currentObject.setPolicyTip(n.getStringValue()); });
            this.put("recipients", (n) -> { currentObject.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the overrideOption property value. The overrideOption property
     * @return a overrideOption
     */
    @javax.annotation.Nullable
    public OverrideOption getOverrideOption() {
        return this._overrideOption;
    }
    /**
     * Gets the policyTip property value. The policyTip property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyTip() {
        return this._policyTip;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this._recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("actionLastModifiedDateTime", this.getActionLastModifiedDateTime());
        writer.writeStringValue("emailText", this.getEmailText());
        writer.writeEnumValue("overrideOption", this.getOverrideOption());
        writer.writeStringValue("policyTip", this.getPolicyTip());
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
    }
    /**
     * Sets the actionLastModifiedDateTime property value. The actionLastModifiedDateTime property
     * @param value Value to set for the actionLastModifiedDateTime property.
     * @return a void
     */
    public void setActionLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._actionLastModifiedDateTime = value;
    }
    /**
     * Sets the emailText property value. The emailText property
     * @param value Value to set for the emailText property.
     * @return a void
     */
    public void setEmailText(@javax.annotation.Nullable final String value) {
        this._emailText = value;
    }
    /**
     * Sets the overrideOption property value. The overrideOption property
     * @param value Value to set for the overrideOption property.
     * @return a void
     */
    public void setOverrideOption(@javax.annotation.Nullable final OverrideOption value) {
        this._overrideOption = value;
    }
    /**
     * Sets the policyTip property value. The policyTip property
     * @param value Value to set for the policyTip property.
     * @return a void
     */
    public void setPolicyTip(@javax.annotation.Nullable final String value) {
        this._policyTip = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final java.util.List<String> value) {
        this._recipients = value;
    }
}
