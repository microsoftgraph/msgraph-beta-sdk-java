package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxExclusionUnit extends ExclusionUnitBase implements Parsable {
    /**
     * Instantiates a new {@link MailboxExclusionUnit} and sets the default values.
     */
    public MailboxExclusionUnit() {
        super();
        this.setOdataType("#microsoft.graph.mailboxExclusionUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailboxExclusionUnit}
     */
    @jakarta.annotation.Nonnull
    public static MailboxExclusionUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxExclusionUnit();
    }
    /**
     * Gets the directoryObjectId property value. The directoryObjectId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectoryObjectId() {
        return this.backingStore.get("directoryObjectId");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryObjectId", (n) -> { this.setDirectoryObjectId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("mailboxType", (n) -> { this.setMailboxType(n.getEnumValue(MailboxType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxType property value. The mailboxType property
     * @return a {@link MailboxType}
     */
    @jakarta.annotation.Nullable
    public MailboxType getMailboxType() {
        return this.backingStore.get("mailboxType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("directoryObjectId", this.getDirectoryObjectId());
        writer.writeEnumValue("mailboxType", this.getMailboxType());
    }
    /**
     * Sets the directoryObjectId property value. The directoryObjectId property
     * @param value Value to set for the directoryObjectId property.
     */
    public void setDirectoryObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directoryObjectId", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the mailboxType property value. The mailboxType property
     * @param value Value to set for the mailboxType property.
     */
    public void setMailboxType(@jakarta.annotation.Nullable final MailboxType value) {
        this.backingStore.set("mailboxType", value);
    }
}
