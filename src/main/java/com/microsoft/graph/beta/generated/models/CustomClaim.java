package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomClaim extends CustomClaimBase implements Parsable {
    /**
     * Instantiates a new {@link CustomClaim} and sets the default values.
     */
    public CustomClaim() {
        super();
        this.setOdataType("#microsoft.graph.customClaim");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomClaim}
     */
    @jakarta.annotation.Nonnull
    public static CustomClaim createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomClaim();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace", (n) -> { this.setNamespace(n.getStringValue()); });
        deserializerMap.put("samlAttributeNameFormat", (n) -> { this.setSamlAttributeNameFormat(n.getEnumValue(SamlAttributeNameFormat::forValue)); });
        deserializerMap.put("tokenFormat", (n) -> { this.setTokenFormat(n.getCollectionOfEnumValues(TokenFormat::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the namespace property value. The namespace property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNamespace() {
        return this.backingStore.get("namespace");
    }
    /**
     * Gets the samlAttributeNameFormat property value. The samlAttributeNameFormat property
     * @return a {@link SamlAttributeNameFormat}
     */
    @jakarta.annotation.Nullable
    public SamlAttributeNameFormat getSamlAttributeNameFormat() {
        return this.backingStore.get("samlAttributeNameFormat");
    }
    /**
     * Gets the tokenFormat property value. The tokenFormat property
     * @return a {@link java.util.List<TokenFormat>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenFormat> getTokenFormat() {
        return this.backingStore.get("tokenFormat");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("namespace", this.getNamespace());
        writer.writeEnumValue("samlAttributeNameFormat", this.getSamlAttributeNameFormat());
        writer.writeCollectionOfEnumValues("tokenFormat", this.getTokenFormat());
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the namespace property value. The namespace property
     * @param value Value to set for the namespace property.
     */
    public void setNamespace(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("namespace", value);
    }
    /**
     * Sets the samlAttributeNameFormat property value. The samlAttributeNameFormat property
     * @param value Value to set for the samlAttributeNameFormat property.
     */
    public void setSamlAttributeNameFormat(@jakarta.annotation.Nullable final SamlAttributeNameFormat value) {
        this.backingStore.set("samlAttributeNameFormat", value);
    }
    /**
     * Sets the tokenFormat property value. The tokenFormat property
     * @param value Value to set for the tokenFormat property.
     */
    public void setTokenFormat(@jakarta.annotation.Nullable final java.util.List<TokenFormat> value) {
        this.backingStore.set("tokenFormat", value);
    }
}
