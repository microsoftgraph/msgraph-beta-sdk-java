package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommunicationsIdentitySet extends IdentitySet implements Parsable {
    /** The application instance associated with this action. */
    private Identity _applicationInstance;
    /** An identity the participant would like to present itself as to the other participants in the call. */
    private Identity _assertedIdentity;
    /** The Azure Communication Services user associated with this action. */
    private Identity _azureCommunicationServicesUser;
    /** The encrypted user associated with this action. */
    private Identity _encrypted;
    /** Type of endpoint the participant is using. Possible values are: default, voicemail, skypeForBusiness, skypeForBusinessVoipPhone and unknownFutureValue. */
    private EndpointType _endpointType;
    /** The guest user associated with this action. */
    private Identity _guest;
    /** The Skype for Business On-Premises user associated with this action. */
    private Identity _onPremises;
    /** Inherited from identitySet. The phone user associated with this action. */
    private Identity _phone;
    /**
     * Instantiates a new CommunicationsIdentitySet and sets the default values.
     * @return a void
     */
    public CommunicationsIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.communicationsIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommunicationsIdentitySet
     */
    @javax.annotation.Nonnull
    public static CommunicationsIdentitySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsIdentitySet();
    }
    /**
     * Gets the applicationInstance property value. The application instance associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getApplicationInstance() {
        return this._applicationInstance;
    }
    /**
     * Gets the assertedIdentity property value. An identity the participant would like to present itself as to the other participants in the call.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getAssertedIdentity() {
        return this._assertedIdentity;
    }
    /**
     * Gets the azureCommunicationServicesUser property value. The Azure Communication Services user associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getAzureCommunicationServicesUser() {
        return this._azureCommunicationServicesUser;
    }
    /**
     * Gets the encrypted property value. The encrypted user associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getEncrypted() {
        return this._encrypted;
    }
    /**
     * Gets the endpointType property value. Type of endpoint the participant is using. Possible values are: default, voicemail, skypeForBusiness, skypeForBusinessVoipPhone and unknownFutureValue.
     * @return a endpointType
     */
    @javax.annotation.Nullable
    public EndpointType getEndpointType() {
        return this._endpointType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommunicationsIdentitySet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationInstance", (n) -> { currentObject.setApplicationInstance(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("assertedIdentity", (n) -> { currentObject.setAssertedIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("azureCommunicationServicesUser", (n) -> { currentObject.setAzureCommunicationServicesUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("encrypted", (n) -> { currentObject.setEncrypted(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("endpointType", (n) -> { currentObject.setEndpointType(n.getEnumValue(EndpointType.class)); });
            this.put("guest", (n) -> { currentObject.setGuest(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("onPremises", (n) -> { currentObject.setOnPremises(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("phone", (n) -> { currentObject.setPhone(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the guest property value. The guest user associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getGuest() {
        return this._guest;
    }
    /**
     * Gets the onPremises property value. The Skype for Business On-Premises user associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getOnPremises() {
        return this._onPremises;
    }
    /**
     * Gets the phone property value. Inherited from identitySet. The phone user associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getPhone() {
        return this._phone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationInstance", this.getApplicationInstance());
        writer.writeObjectValue("assertedIdentity", this.getAssertedIdentity());
        writer.writeObjectValue("azureCommunicationServicesUser", this.getAzureCommunicationServicesUser());
        writer.writeObjectValue("encrypted", this.getEncrypted());
        writer.writeEnumValue("endpointType", this.getEndpointType());
        writer.writeObjectValue("guest", this.getGuest());
        writer.writeObjectValue("onPremises", this.getOnPremises());
        writer.writeObjectValue("phone", this.getPhone());
    }
    /**
     * Sets the applicationInstance property value. The application instance associated with this action.
     * @param value Value to set for the applicationInstance property.
     * @return a void
     */
    public void setApplicationInstance(@javax.annotation.Nullable final Identity value) {
        this._applicationInstance = value;
    }
    /**
     * Sets the assertedIdentity property value. An identity the participant would like to present itself as to the other participants in the call.
     * @param value Value to set for the assertedIdentity property.
     * @return a void
     */
    public void setAssertedIdentity(@javax.annotation.Nullable final Identity value) {
        this._assertedIdentity = value;
    }
    /**
     * Sets the azureCommunicationServicesUser property value. The Azure Communication Services user associated with this action.
     * @param value Value to set for the azureCommunicationServicesUser property.
     * @return a void
     */
    public void setAzureCommunicationServicesUser(@javax.annotation.Nullable final Identity value) {
        this._azureCommunicationServicesUser = value;
    }
    /**
     * Sets the encrypted property value. The encrypted user associated with this action.
     * @param value Value to set for the encrypted property.
     * @return a void
     */
    public void setEncrypted(@javax.annotation.Nullable final Identity value) {
        this._encrypted = value;
    }
    /**
     * Sets the endpointType property value. Type of endpoint the participant is using. Possible values are: default, voicemail, skypeForBusiness, skypeForBusinessVoipPhone and unknownFutureValue.
     * @param value Value to set for the endpointType property.
     * @return a void
     */
    public void setEndpointType(@javax.annotation.Nullable final EndpointType value) {
        this._endpointType = value;
    }
    /**
     * Sets the guest property value. The guest user associated with this action.
     * @param value Value to set for the guest property.
     * @return a void
     */
    public void setGuest(@javax.annotation.Nullable final Identity value) {
        this._guest = value;
    }
    /**
     * Sets the onPremises property value. The Skype for Business On-Premises user associated with this action.
     * @param value Value to set for the onPremises property.
     * @return a void
     */
    public void setOnPremises(@javax.annotation.Nullable final Identity value) {
        this._onPremises = value;
    }
    /**
     * Sets the phone property value. Inherited from identitySet. The phone user associated with this action.
     * @param value Value to set for the phone property.
     * @return a void
     */
    public void setPhone(@javax.annotation.Nullable final Identity value) {
        this._phone = value;
    }
}
