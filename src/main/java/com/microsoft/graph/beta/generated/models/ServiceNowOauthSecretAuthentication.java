package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * App id for the ServiceNow client app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceNowOauthSecretAuthentication extends ServiceNowAuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link ServiceNowOauthSecretAuthentication} and sets the default values.
     */
    public ServiceNowOauthSecretAuthentication() {
        super();
        this.setOdataType("#microsoft.graph.serviceNowOauthSecretAuthentication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceNowOauthSecretAuthentication}
     */
    @jakarta.annotation.Nonnull
    public static ServiceNowOauthSecretAuthentication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceNowOauthSecretAuthentication();
    }
    /**
     * Gets the appId property value. Tenant appId registered with Azure AD
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
    }
    /**
     * Sets the appId property value. Tenant appId registered with Azure AD
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
}
