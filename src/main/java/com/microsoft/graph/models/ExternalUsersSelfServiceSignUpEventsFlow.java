package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalUsersSelfServiceSignUpEventsFlow extends AuthenticationEventsFlow implements Parsable {
    /**
     * The configuration for what to invoke when attributes are ready to be collected from the user.
     */
    private OnAttributeCollectionHandler onAttributeCollection;
    /**
     * Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
     */
    private OnAuthenticationMethodLoadStartHandler onAuthenticationMethodLoadStart;
    /**
     * Required. The configuration for what to invoke when an authentication flow is ready to be initiated.
     */
    private OnInteractiveAuthFlowStartHandler onInteractiveAuthFlowStart;
    /**
     * The configuration for what to invoke during user creation.
     */
    private OnUserCreateStartHandler onUserCreateStart;
    /**
     * Instantiates a new ExternalUsersSelfServiceSignUpEventsFlow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalUsersSelfServiceSignUpEventsFlow() {
        super();
        this.setOdataType("#microsoft.graph.externalUsersSelfServiceSignUpEventsFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalUsersSelfServiceSignUpEventsFlow
     */
    @javax.annotation.Nonnull
    public static ExternalUsersSelfServiceSignUpEventsFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalUsersSelfServiceSignUpEventsFlow();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onAttributeCollection", (n) -> { this.setOnAttributeCollection(n.getObjectValue(OnAttributeCollectionHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("onAuthenticationMethodLoadStart", (n) -> { this.setOnAuthenticationMethodLoadStart(n.getObjectValue(OnAuthenticationMethodLoadStartHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("onInteractiveAuthFlowStart", (n) -> { this.setOnInteractiveAuthFlowStart(n.getObjectValue(OnInteractiveAuthFlowStartHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("onUserCreateStart", (n) -> { this.setOnUserCreateStart(n.getObjectValue(OnUserCreateStartHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the onAttributeCollection property value. The configuration for what to invoke when attributes are ready to be collected from the user.
     * @return a onAttributeCollectionHandler
     */
    @javax.annotation.Nullable
    public OnAttributeCollectionHandler getOnAttributeCollection() {
        return this.onAttributeCollection;
    }
    /**
     * Gets the onAuthenticationMethodLoadStart property value. Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
     * @return a onAuthenticationMethodLoadStartHandler
     */
    @javax.annotation.Nullable
    public OnAuthenticationMethodLoadStartHandler getOnAuthenticationMethodLoadStart() {
        return this.onAuthenticationMethodLoadStart;
    }
    /**
     * Gets the onInteractiveAuthFlowStart property value. Required. The configuration for what to invoke when an authentication flow is ready to be initiated.
     * @return a onInteractiveAuthFlowStartHandler
     */
    @javax.annotation.Nullable
    public OnInteractiveAuthFlowStartHandler getOnInteractiveAuthFlowStart() {
        return this.onInteractiveAuthFlowStart;
    }
    /**
     * Gets the onUserCreateStart property value. The configuration for what to invoke during user creation.
     * @return a onUserCreateStartHandler
     */
    @javax.annotation.Nullable
    public OnUserCreateStartHandler getOnUserCreateStart() {
        return this.onUserCreateStart;
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
        writer.writeObjectValue("onAttributeCollection", this.getOnAttributeCollection());
        writer.writeObjectValue("onAuthenticationMethodLoadStart", this.getOnAuthenticationMethodLoadStart());
        writer.writeObjectValue("onInteractiveAuthFlowStart", this.getOnInteractiveAuthFlowStart());
        writer.writeObjectValue("onUserCreateStart", this.getOnUserCreateStart());
    }
    /**
     * Sets the onAttributeCollection property value. The configuration for what to invoke when attributes are ready to be collected from the user.
     * @param value Value to set for the onAttributeCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnAttributeCollection(@javax.annotation.Nullable final OnAttributeCollectionHandler value) {
        this.onAttributeCollection = value;
    }
    /**
     * Sets the onAuthenticationMethodLoadStart property value. Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
     * @param value Value to set for the onAuthenticationMethodLoadStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnAuthenticationMethodLoadStart(@javax.annotation.Nullable final OnAuthenticationMethodLoadStartHandler value) {
        this.onAuthenticationMethodLoadStart = value;
    }
    /**
     * Sets the onInteractiveAuthFlowStart property value. Required. The configuration for what to invoke when an authentication flow is ready to be initiated.
     * @param value Value to set for the onInteractiveAuthFlowStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnInteractiveAuthFlowStart(@javax.annotation.Nullable final OnInteractiveAuthFlowStartHandler value) {
        this.onInteractiveAuthFlowStart = value;
    }
    /**
     * Sets the onUserCreateStart property value. The configuration for what to invoke during user creation.
     * @param value Value to set for the onUserCreateStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnUserCreateStart(@javax.annotation.Nullable final OnUserCreateStartHandler value) {
        this.onUserCreateStart = value;
    }
}
