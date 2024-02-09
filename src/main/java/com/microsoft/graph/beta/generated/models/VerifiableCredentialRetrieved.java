package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifiableCredentialRetrieved extends VerifiableCredentialRequirementStatus implements Parsable {
    /**
     * Instantiates a new {@link VerifiableCredentialRetrieved} and sets the default values.
     */
    public VerifiableCredentialRetrieved() {
        super();
        this.setOdataType("#microsoft.graph.verifiableCredentialRetrieved");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifiableCredentialRetrieved}
     */
    @jakarta.annotation.Nonnull
    public static VerifiableCredentialRetrieved createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiableCredentialRetrieved();
    }
    /**
     * Gets the expiryDateTime property value. The specific date and time that the presentation request will expire and a new one will need to be generated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this.backingStore.get("expiryDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expiryDateTime", this.getExpiryDateTime());
    }
    /**
     * Sets the expiryDateTime property value. The specific date and time that the presentation request will expire and a new one will need to be generated.
     * @param value Value to set for the expiryDateTime property.
     */
    public void setExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiryDateTime", value);
    }
}
