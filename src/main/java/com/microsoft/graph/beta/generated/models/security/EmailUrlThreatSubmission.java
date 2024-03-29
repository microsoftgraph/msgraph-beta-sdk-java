package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailUrlThreatSubmission extends EmailThreatSubmission implements Parsable {
    /**
     * Instantiates a new {@link EmailUrlThreatSubmission} and sets the default values.
     */
    public EmailUrlThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.emailUrlThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmailUrlThreatSubmission}
     */
    @jakarta.annotation.Nonnull
    public static EmailUrlThreatSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailUrlThreatSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("messageUrl", (n) -> { this.setMessageUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageUrl property value. Specifies the url of the message to be submitted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageUrl() {
        return this.backingStore.get("messageUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("messageUrl", this.getMessageUrl());
    }
    /**
     * Sets the messageUrl property value. Specifies the url of the message to be submitted.
     * @param value Value to set for the messageUrl property.
     */
    public void setMessageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageUrl", value);
    }
}
