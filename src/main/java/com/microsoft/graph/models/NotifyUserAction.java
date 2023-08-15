package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NotifyUserAction extends DlpActionInfo implements Parsable {
    /**
     * The actionLastModifiedDateTime property
     */
    private OffsetDateTime actionLastModifiedDateTime;
    /**
     * The emailText property
     */
    private String emailText;
    /**
     * The policyTip property
     */
    private String policyTip;
    /**
     * The recipients property
     */
    private java.util.List<String> recipients;
    /**
     * Instantiates a new notifyUserAction and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public NotifyUserAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a notifyUserAction
     */
    @jakarta.annotation.Nonnull
    public static NotifyUserAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotifyUserAction();
    }
    /**
     * Gets the actionLastModifiedDateTime property value. The actionLastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActionLastModifiedDateTime() {
        return this.actionLastModifiedDateTime;
    }
    /**
     * Gets the emailText property value. The emailText property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmailText() {
        return this.emailText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionLastModifiedDateTime", (n) -> { this.setActionLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("emailText", (n) -> { this.setEmailText(n.getStringValue()); });
        deserializerMap.put("policyTip", (n) -> { this.setPolicyTip(n.getStringValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the policyTip property value. The policyTip property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyTip() {
        return this.policyTip;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this.recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("actionLastModifiedDateTime", this.getActionLastModifiedDateTime());
        writer.writeStringValue("emailText", this.getEmailText());
        writer.writeStringValue("policyTip", this.getPolicyTip());
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
    }
    /**
     * Sets the actionLastModifiedDateTime property value. The actionLastModifiedDateTime property
     * @param value Value to set for the actionLastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setActionLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.actionLastModifiedDateTime = value;
    }
    /**
     * Sets the emailText property value. The emailText property
     * @param value Value to set for the emailText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmailText(@jakarta.annotation.Nullable final String value) {
        this.emailText = value;
    }
    /**
     * Sets the policyTip property value. The policyTip property
     * @param value Value to set for the policyTip property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicyTip(@jakarta.annotation.Nullable final String value) {
        this.policyTip = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.recipients = value;
    }
}
