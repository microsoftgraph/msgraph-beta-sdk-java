package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GlobalSecureAccessFilteringProfileSessionControl extends ConditionalAccessSessionControl implements Parsable {
    /**
     * Instantiates a new {@link GlobalSecureAccessFilteringProfileSessionControl} and sets the default values.
     */
    public GlobalSecureAccessFilteringProfileSessionControl() {
        super();
        this.setOdataType("#microsoft.graph.globalSecureAccessFilteringProfileSessionControl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GlobalSecureAccessFilteringProfileSessionControl}
     */
    @jakarta.annotation.Nonnull
    public static GlobalSecureAccessFilteringProfileSessionControl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GlobalSecureAccessFilteringProfileSessionControl();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("profileId", (n) -> { this.setProfileId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the profileId property value. Specifies the distinct identifier that is assigned to the security profile or filtering profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileId() {
        return this.backingStore.get("profileId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("profileId", this.getProfileId());
    }
    /**
     * Sets the profileId property value. Specifies the distinct identifier that is assigned to the security profile or filtering profile.
     * @param value Value to set for the profileId property.
     */
    public void setProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileId", value);
    }
}
