package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifiableCredentialRequired extends VerifiableCredentialRequirementStatus implements Parsable {
    /**
     * When the presentation request will expire and a new one will need to be generated.
     */
    private OffsetDateTime expiryDateTime;
    /**
     * A URL that launches the digital wallet and starts the presentation process. You can present this URL to the user if they can't scan the QR code.
     */
    private String url;
    /**
     * Instantiates a new verifiableCredentialRequired and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerifiableCredentialRequired() {
        super();
        this.setOdataType("#microsoft.graph.verifiableCredentialRequired");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifiableCredentialRequired
     */
    @javax.annotation.Nonnull
    public static VerifiableCredentialRequired createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiableCredentialRequired();
    }
    /**
     * Gets the expiryDateTime property value. When the presentation request will expire and a new one will need to be generated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this.expiryDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the url property value. A URL that launches the digital wallet and starts the presentation process. You can present this URL to the user if they can't scan the QR code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeOffsetDateTimeValue("expiryDateTime", this.getExpiryDateTime());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the expiryDateTime property value. When the presentation request will expire and a new one will need to be generated.
     * @param value Value to set for the expiryDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expiryDateTime = value;
    }
    /**
     * Sets the url property value. A URL that launches the digital wallet and starts the presentation process. You can present this URL to the user if they can't scan the QR code.
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
