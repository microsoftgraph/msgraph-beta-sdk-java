package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotifyUserAction extends DlpActionInfo implements Parsable {
    /**
     * Instantiates a new {@link NotifyUserAction} and sets the default values.
     */
    public NotifyUserAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NotifyUserAction}
     */
    @jakarta.annotation.Nonnull
    public static NotifyUserAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotifyUserAction();
    }
    /**
     * Gets the actionLastModifiedDateTime property value. Timestamp when the notification action configuration was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActionLastModifiedDateTime() {
        return this.backingStore.get("actionLastModifiedDateTime");
    }
    /**
     * Gets the emailText property value. The body text of the email notification sent to users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailText() {
        return this.backingStore.get("emailText");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the policyTip property value. The text of the policy tip displayed to the user within the application (For example, Outlook, Word).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyTip() {
        return this.backingStore.get("policyTip");
    }
    /**
     * Gets the recipients property value. List of email addresses or user identifiers designated to receive the notification email. Can include sender, owner, manager, etc.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("actionLastModifiedDateTime", this.getActionLastModifiedDateTime());
        writer.writeStringValue("emailText", this.getEmailText());
        writer.writeStringValue("policyTip", this.getPolicyTip());
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
    }
    /**
     * Sets the actionLastModifiedDateTime property value. Timestamp when the notification action configuration was last modified.
     * @param value Value to set for the actionLastModifiedDateTime property.
     */
    public void setActionLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("actionLastModifiedDateTime", value);
    }
    /**
     * Sets the emailText property value. The body text of the email notification sent to users.
     * @param value Value to set for the emailText property.
     */
    public void setEmailText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailText", value);
    }
    /**
     * Sets the policyTip property value. The text of the policy tip displayed to the user within the application (For example, Outlook, Word).
     * @param value Value to set for the policyTip property.
     */
    public void setPolicyTip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyTip", value);
    }
    /**
     * Sets the recipients property value. List of email addresses or user identifiers designated to receive the notification email. Can include sender, owner, manager, etc.
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recipients", value);
    }
}
