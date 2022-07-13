package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** iOS Volume Purchase Program license assignment. This class does not support Create, Delete, or Update. */
public class IosVppAppAssignedLicense extends Entity implements Parsable {
    /** The user email address. */
    private String _userEmailAddress;
    /** The user ID. */
    private String _userId;
    /** The user name. */
    private String _userName;
    /** The user principal name. */
    private String _userPrincipalName;
    /**
     * Instantiates a new iosVppAppAssignedLicense and sets the default values.
     * @return a void
     */
    public IosVppAppAssignedLicense() {
        super();
        this.setType("#microsoft.graph.iosVppAppAssignedLicense");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosVppAppAssignedLicense
     */
    @javax.annotation.Nonnull
    public static IosVppAppAssignedLicense createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosVppAppAssignedDeviceLicense": return new IosVppAppAssignedDeviceLicense();
                case "#microsoft.graph.iosVppAppAssignedUserLicense": return new IosVppAppAssignedUserLicense();
            }
        }
        return new IosVppAppAssignedLicense();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosVppAppAssignedLicense currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("userEmailAddress", (n) -> { currentObject.setUserEmailAddress(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the userEmailAddress property value. The user email address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmailAddress() {
        return this._userEmailAddress;
    }
    /**
     * Gets the userId property value. The user ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userName property value. The user name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("userEmailAddress", this.getUserEmailAddress());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the userEmailAddress property value. The user email address.
     * @param value Value to set for the userEmailAddress property.
     * @return a void
     */
    public void setUserEmailAddress(@javax.annotation.Nullable final String value) {
        this._userEmailAddress = value;
    }
    /**
     * Sets the userId property value. The user ID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userName property value. The user name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
