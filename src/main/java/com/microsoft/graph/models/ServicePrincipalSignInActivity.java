package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalSignInActivity extends Entity implements Parsable {
    /**
     * The application ID of the resource.
     */
    private String appId;
    /**
     * The sign-in activity of the application in a app-only authentication flow (app-to-app tokens) where the application acts like a client.
     */
    private SignInActivity applicationAuthenticationClientSignInActivity;
    /**
     * The sign-in activity of the application in a app-only authentication flow (app-to-app tokens) where the application acts like a resource.
     */
    private SignInActivity applicationAuthenticationResourceSignInActivity;
    /**
     * The sign-in activity of the application in a delegated flow (user sign-in) where the application acts like a client.
     */
    private SignInActivity delegatedClientSignInActivity;
    /**
     * The sign-in activity of the application in a delegated flow (user sign-in) where the application acts like a resource.
     */
    private SignInActivity delegatedResourceSignInActivity;
    /**
     * The most recent sign-in activity of the application across delegated or app-only flows where the application is used either as a client or resource.
     */
    private SignInActivity lastSignInActivity;
    /**
     * Instantiates a new ServicePrincipalSignInActivity and sets the default values.
     */
    public ServicePrincipalSignInActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipalSignInActivity
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalSignInActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalSignInActivity();
    }
    /**
     * Gets the appId property value. The application ID of the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the applicationAuthenticationClientSignInActivity property value. The sign-in activity of the application in a app-only authentication flow (app-to-app tokens) where the application acts like a client.
     * @return a SignInActivity
     */
    @jakarta.annotation.Nullable
    public SignInActivity getApplicationAuthenticationClientSignInActivity() {
        return this.applicationAuthenticationClientSignInActivity;
    }
    /**
     * Gets the applicationAuthenticationResourceSignInActivity property value. The sign-in activity of the application in a app-only authentication flow (app-to-app tokens) where the application acts like a resource.
     * @return a SignInActivity
     */
    @jakarta.annotation.Nullable
    public SignInActivity getApplicationAuthenticationResourceSignInActivity() {
        return this.applicationAuthenticationResourceSignInActivity;
    }
    /**
     * Gets the delegatedClientSignInActivity property value. The sign-in activity of the application in a delegated flow (user sign-in) where the application acts like a client.
     * @return a SignInActivity
     */
    @jakarta.annotation.Nullable
    public SignInActivity getDelegatedClientSignInActivity() {
        return this.delegatedClientSignInActivity;
    }
    /**
     * Gets the delegatedResourceSignInActivity property value. The sign-in activity of the application in a delegated flow (user sign-in) where the application acts like a resource.
     * @return a SignInActivity
     */
    @jakarta.annotation.Nullable
    public SignInActivity getDelegatedResourceSignInActivity() {
        return this.delegatedResourceSignInActivity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("applicationAuthenticationClientSignInActivity", (n) -> { this.setApplicationAuthenticationClientSignInActivity(n.getObjectValue(SignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("applicationAuthenticationResourceSignInActivity", (n) -> { this.setApplicationAuthenticationResourceSignInActivity(n.getObjectValue(SignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("delegatedClientSignInActivity", (n) -> { this.setDelegatedClientSignInActivity(n.getObjectValue(SignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("delegatedResourceSignInActivity", (n) -> { this.setDelegatedResourceSignInActivity(n.getObjectValue(SignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSignInActivity", (n) -> { this.setLastSignInActivity(n.getObjectValue(SignInActivity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastSignInActivity property value. The most recent sign-in activity of the application across delegated or app-only flows where the application is used either as a client or resource.
     * @return a SignInActivity
     */
    @jakarta.annotation.Nullable
    public SignInActivity getLastSignInActivity() {
        return this.lastSignInActivity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeObjectValue("applicationAuthenticationClientSignInActivity", this.getApplicationAuthenticationClientSignInActivity());
        writer.writeObjectValue("applicationAuthenticationResourceSignInActivity", this.getApplicationAuthenticationResourceSignInActivity());
        writer.writeObjectValue("delegatedClientSignInActivity", this.getDelegatedClientSignInActivity());
        writer.writeObjectValue("delegatedResourceSignInActivity", this.getDelegatedResourceSignInActivity());
        writer.writeObjectValue("lastSignInActivity", this.getLastSignInActivity());
    }
    /**
     * Sets the appId property value. The application ID of the resource.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the applicationAuthenticationClientSignInActivity property value. The sign-in activity of the application in a app-only authentication flow (app-to-app tokens) where the application acts like a client.
     * @param value Value to set for the applicationAuthenticationClientSignInActivity property.
     */
    public void setApplicationAuthenticationClientSignInActivity(@jakarta.annotation.Nullable final SignInActivity value) {
        this.applicationAuthenticationClientSignInActivity = value;
    }
    /**
     * Sets the applicationAuthenticationResourceSignInActivity property value. The sign-in activity of the application in a app-only authentication flow (app-to-app tokens) where the application acts like a resource.
     * @param value Value to set for the applicationAuthenticationResourceSignInActivity property.
     */
    public void setApplicationAuthenticationResourceSignInActivity(@jakarta.annotation.Nullable final SignInActivity value) {
        this.applicationAuthenticationResourceSignInActivity = value;
    }
    /**
     * Sets the delegatedClientSignInActivity property value. The sign-in activity of the application in a delegated flow (user sign-in) where the application acts like a client.
     * @param value Value to set for the delegatedClientSignInActivity property.
     */
    public void setDelegatedClientSignInActivity(@jakarta.annotation.Nullable final SignInActivity value) {
        this.delegatedClientSignInActivity = value;
    }
    /**
     * Sets the delegatedResourceSignInActivity property value. The sign-in activity of the application in a delegated flow (user sign-in) where the application acts like a resource.
     * @param value Value to set for the delegatedResourceSignInActivity property.
     */
    public void setDelegatedResourceSignInActivity(@jakarta.annotation.Nullable final SignInActivity value) {
        this.delegatedResourceSignInActivity = value;
    }
    /**
     * Sets the lastSignInActivity property value. The most recent sign-in activity of the application across delegated or app-only flows where the application is used either as a client or resource.
     * @param value Value to set for the lastSignInActivity property.
     */
    public void setLastSignInActivity(@jakarta.annotation.Nullable final SignInActivity value) {
        this.lastSignInActivity = value;
    }
}
