package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp extends OnInteractiveAuthFlowStartHandler implements Parsable {
    /**
     * Optional. Specifes whether the authentication flow includes an option to sign up (create account) as well as sign in. Default value is false meaning only sign in is enabled.
     */
    private Boolean isSignUpAllowed;
    /**
     * Instantiates a new OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp() {
        super();
        this.setOdataType("#microsoft.graph.onInteractiveAuthFlowStartExternalUsersSelfServiceSignUp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp
     */
    @javax.annotation.Nonnull
    public static OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isSignUpAllowed", (n) -> { this.setIsSignUpAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSignUpAllowed property value. Optional. Specifes whether the authentication flow includes an option to sign up (create account) as well as sign in. Default value is false meaning only sign in is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSignUpAllowed() {
        return this.isSignUpAllowed;
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
        writer.writeBooleanValue("isSignUpAllowed", this.getIsSignUpAllowed());
    }
    /**
     * Sets the isSignUpAllowed property value. Optional. Specifes whether the authentication flow includes an option to sign up (create account) as well as sign in. Default value is false meaning only sign in is enabled.
     * @param value Value to set for the isSignUpAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSignUpAllowed(@javax.annotation.Nullable final Boolean value) {
        this.isSignUpAllowed = value;
    }
}
