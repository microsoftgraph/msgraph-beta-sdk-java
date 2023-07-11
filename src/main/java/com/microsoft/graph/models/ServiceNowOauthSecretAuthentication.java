package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * App id for the ServiceNow client app.
 */
public class ServiceNowOauthSecretAuthentication extends ServiceNowAuthenticationMethod implements Parsable {
    /**
     * Tenant appId registered with Azure AD
     */
    private String appId;
    /**
     * Instantiates a new serviceNowOauthSecretAuthentication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceNowOauthSecretAuthentication() {
        super();
        this.setOdataType("#microsoft.graph.serviceNowOauthSecretAuthentication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceNowOauthSecretAuthentication
     */
    @javax.annotation.Nonnull
    public static ServiceNowOauthSecretAuthentication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceNowOauthSecretAuthentication();
    }
    /**
     * Gets the appId property value. Tenant appId registered with Azure AD
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("appId", this.getAppId());
    }
    /**
     * Sets the appId property value. Tenant appId registered with Azure AD
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
}
