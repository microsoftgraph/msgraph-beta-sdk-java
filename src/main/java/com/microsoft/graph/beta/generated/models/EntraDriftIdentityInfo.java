package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntraDriftIdentityInfo extends DriftIdentityInfo implements Parsable {
    /**
     * Instantiates a new {@link EntraDriftIdentityInfo} and sets the default values.
     */
    public EntraDriftIdentityInfo() {
        super();
        this.setOdataType("#microsoft.graph.entraDriftIdentityInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EntraDriftIdentityInfo}
     */
    @jakarta.annotation.Nonnull
    public static EntraDriftIdentityInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntraDriftIdentityInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identityType", (n) -> { this.setIdentityType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityType property value. The identityType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityType() {
        return this.backingStore.get("identityType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identityType", this.getIdentityType());
    }
    /**
     * Sets the identityType property value. The identityType property
     * @param value Value to set for the identityType property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityType", value);
    }
}
