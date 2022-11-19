package com.microsoft.graph.models;

import com.microsoft.graph.models.IosVppAppAssignedDeviceLicense;
import com.microsoft.graph.models.IosVppAppAssignedUserLicense;
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
    @javax.annotation.Nullable
    public IosVppAppAssignedLicense() {
        super();
        this.setOdataType("#microsoft.graph.iosVppAppAssignedLicense");
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userEmailAddress", (n) -> { currentObject.setUserEmailAddress(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setUserEmailAddress(@javax.annotation.Nullable final String value) {
        this._userEmailAddress = value;
    }
    /**
     * Sets the userId property value. The user ID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userName property value. The user name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
