package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SamlNameIdClaim extends CustomClaimBase implements Parsable {
    /**
     * Instantiates a new {@link SamlNameIdClaim} and sets the default values.
     */
    public SamlNameIdClaim() {
        super();
        this.setOdataType("#microsoft.graph.samlNameIdClaim");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SamlNameIdClaim}
     */
    @jakarta.annotation.Nonnull
    public static SamlNameIdClaim createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SamlNameIdClaim();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("nameIdFormat", (n) -> { this.setNameIdFormat(n.getEnumValue(SamlNameIDFormat::forValue)); });
        deserializerMap.put("serviceProviderNameQualifier", (n) -> { this.setServiceProviderNameQualifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameIdFormat property value. The nameIdFormat property
     * @return a {@link SamlNameIDFormat}
     */
    @jakarta.annotation.Nullable
    public SamlNameIDFormat getNameIdFormat() {
        return this.backingStore.get("nameIdFormat");
    }
    /**
     * Gets the serviceProviderNameQualifier property value. The serviceProviderNameQualifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceProviderNameQualifier() {
        return this.backingStore.get("serviceProviderNameQualifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("nameIdFormat", this.getNameIdFormat());
        writer.writeStringValue("serviceProviderNameQualifier", this.getServiceProviderNameQualifier());
    }
    /**
     * Sets the nameIdFormat property value. The nameIdFormat property
     * @param value Value to set for the nameIdFormat property.
     */
    public void setNameIdFormat(@jakarta.annotation.Nullable final SamlNameIDFormat value) {
        this.backingStore.set("nameIdFormat", value);
    }
    /**
     * Sets the serviceProviderNameQualifier property value. The serviceProviderNameQualifier property
     * @param value Value to set for the serviceProviderNameQualifier property.
     */
    public void setServiceProviderNameQualifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceProviderNameQualifier", value);
    }
}
