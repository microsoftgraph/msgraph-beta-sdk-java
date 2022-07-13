package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommunicationsIdentitySet extends IdentitySet implements Parsable {
    /** The assertedIdentity property */
    private Identity _assertedIdentity;
    /** The azureCommunicationServicesUser property */
    private Identity _azureCommunicationServicesUser;
    /** The endpointType property */
    private EndpointType _endpointType;
    /**
     * Instantiates a new CommunicationsIdentitySet and sets the default values.
     * @return a void
     */
    public CommunicationsIdentitySet() {
        super();
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
     * Gets the assertedIdentity property value. The assertedIdentity property
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getAssertedIdentity() {
        return this._assertedIdentity;
    }
    /**
     * Gets the azureCommunicationServicesUser property value. The azureCommunicationServicesUser property
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getAzureCommunicationServicesUser() {
        return this._azureCommunicationServicesUser;
    }
    /**
     * Gets the endpointType property value. The endpointType property
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
            this.put("assertedIdentity", (n) -> { currentObject.setAssertedIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("azureCommunicationServicesUser", (n) -> { currentObject.setAzureCommunicationServicesUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("endpointType", (n) -> { currentObject.setEndpointType(n.getEnumValue(EndpointType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assertedIdentity", this.getAssertedIdentity());
        writer.writeObjectValue("azureCommunicationServicesUser", this.getAzureCommunicationServicesUser());
        writer.writeEnumValue("endpointType", this.getEndpointType());
    }
    /**
     * Sets the assertedIdentity property value. The assertedIdentity property
     * @param value Value to set for the assertedIdentity property.
     * @return a void
     */
    public void setAssertedIdentity(@javax.annotation.Nullable final Identity value) {
        this._assertedIdentity = value;
    }
    /**
     * Sets the azureCommunicationServicesUser property value. The azureCommunicationServicesUser property
     * @param value Value to set for the azureCommunicationServicesUser property.
     * @return a void
     */
    public void setAzureCommunicationServicesUser(@javax.annotation.Nullable final Identity value) {
        this._azureCommunicationServicesUser = value;
    }
    /**
     * Sets the endpointType property value. The endpointType property
     * @param value Value to set for the endpointType property.
     * @return a void
     */
    public void setEndpointType(@javax.annotation.Nullable final EndpointType value) {
        this._endpointType = value;
    }
}
