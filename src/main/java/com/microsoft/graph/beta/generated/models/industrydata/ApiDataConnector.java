package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiDataConnector extends IndustryDataConnector implements Parsable {
    /**
     * Instantiates a new {@link ApiDataConnector} and sets the default values.
     */
    public ApiDataConnector() {
        super();
        this.setOdataType("#microsoft.graph.industryData.apiDataConnector");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApiDataConnector}
     */
    @jakarta.annotation.Nonnull
    public static ApiDataConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.oneRosterApiDataConnector": return new OneRosterApiDataConnector();
            }
        }
        return new ApiDataConnector();
    }
    /**
     * Gets the apiFormat property value. The apiFormat property
     * @return a {@link ApiFormat}
     */
    @jakarta.annotation.Nullable
    public ApiFormat getApiFormat() {
        return this.backingStore.get("apiFormat");
    }
    /**
     * Gets the baseUrl property value. The base URL, including the scheme, host, and path for the API, with or without a trailing &apos;/&apos;. For example, &apos;https://example.com/ims/oneRoster/v1p1&apos;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaseUrl() {
        return this.backingStore.get("baseUrl");
    }
    /**
     * Gets the credential property value. The credential property
     * @return a {@link Credential}
     */
    @jakarta.annotation.Nullable
    public Credential getCredential() {
        return this.backingStore.get("credential");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiFormat", (n) -> { this.setApiFormat(n.getEnumValue(ApiFormat::forValue)); });
        deserializerMap.put("baseUrl", (n) -> { this.setBaseUrl(n.getStringValue()); });
        deserializerMap.put("credential", (n) -> { this.setCredential(n.getObjectValue(Credential::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("apiFormat", this.getApiFormat());
        writer.writeStringValue("baseUrl", this.getBaseUrl());
        writer.writeObjectValue("credential", this.getCredential());
    }
    /**
     * Sets the apiFormat property value. The apiFormat property
     * @param value Value to set for the apiFormat property.
     */
    public void setApiFormat(@jakarta.annotation.Nullable final ApiFormat value) {
        this.backingStore.set("apiFormat", value);
    }
    /**
     * Sets the baseUrl property value. The base URL, including the scheme, host, and path for the API, with or without a trailing &apos;/&apos;. For example, &apos;https://example.com/ims/oneRoster/v1p1&apos;
     * @param value Value to set for the baseUrl property.
     */
    public void setBaseUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("baseUrl", value);
    }
    /**
     * Sets the credential property value. The credential property
     * @param value Value to set for the credential property.
     */
    public void setCredential(@jakarta.annotation.Nullable final Credential value) {
        this.backingStore.set("credential", value);
    }
}
