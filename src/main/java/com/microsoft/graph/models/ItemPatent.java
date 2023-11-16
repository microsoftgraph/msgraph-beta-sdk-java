package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemPatent extends ItemFacet implements Parsable {
    /**
     * Instantiates a new ItemPatent and sets the default values.
     */
    public ItemPatent() {
        super();
        this.setOdataType("#microsoft.graph.itemPatent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemPatent
     */
    @jakarta.annotation.Nonnull
    public static ItemPatent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPatent();
    }
    /**
     * Gets the description property value. Descpription of the patent or filing.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Title of the patent or filing.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isPending", (n) -> { this.setIsPending(n.getBooleanValue()); });
        deserializerMap.put("issuedDate", (n) -> { this.setIssuedDate(n.getLocalDateValue()); });
        deserializerMap.put("issuingAuthority", (n) -> { this.setIssuingAuthority(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPending property value. Indicates the patent is pending.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPending() {
        return this.BackingStore.get("isPending");
    }
    /**
     * Gets the issuedDate property value. The date that the patent was granted.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this.BackingStore.get("issuedDate");
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the patent.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuingAuthority() {
        return this.BackingStore.get("issuingAuthority");
    }
    /**
     * Gets the number property value. The patent number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.BackingStore.get("number");
    }
    /**
     * Gets the webUrl property value. URL referencing the patent or filing.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.BackingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isPending", this.getIsPending());
        writer.writeLocalDateValue("issuedDate", this.getIssuedDate());
        writer.writeStringValue("issuingAuthority", this.getIssuingAuthority());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Descpription of the patent or filing.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Title of the patent or filing.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the isPending property value. Indicates the patent is pending.
     * @param value Value to set for the isPending property.
     */
    public void setIsPending(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isPending", value);
    }
    /**
     * Sets the issuedDate property value. The date that the patent was granted.
     * @param value Value to set for the issuedDate property.
     */
    public void setIssuedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("issuedDate", value);
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the patent.
     * @param value Value to set for the issuingAuthority property.
     */
    public void setIssuingAuthority(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("issuingAuthority", value);
    }
    /**
     * Sets the number property value. The patent number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("number", value);
    }
    /**
     * Sets the webUrl property value. URL referencing the patent or filing.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("webUrl", value);
    }
}
