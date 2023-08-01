package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImpactedUserAsset extends ImpactedAsset implements Parsable {
    /**
     * The identifier property
     */
    private UserAssetIdentifier identifier;
    /**
     * Instantiates a new impactedUserAsset and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImpactedUserAsset() {
        super();
        this.setOdataType("#microsoft.graph.security.impactedUserAsset");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a impactedUserAsset
     */
    @javax.annotation.Nonnull
    public static ImpactedUserAsset createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImpactedUserAsset();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getEnumValue(UserAssetIdentifier.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a userAssetIdentifier
     */
    @javax.annotation.Nullable
    public UserAssetIdentifier getIdentifier() {
        return this.identifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("identifier", this.getIdentifier());
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifier(@javax.annotation.Nullable final UserAssetIdentifier value) {
        this.identifier = value;
    }
}
