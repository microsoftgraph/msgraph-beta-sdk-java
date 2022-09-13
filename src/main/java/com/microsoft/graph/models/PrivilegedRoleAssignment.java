package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class PrivilegedRoleAssignment extends Entity implements Parsable {
    /** The UTC DateTime when the temporary privileged role assignment will be expired. For permanent role assignment, the value is null. */
    private OffsetDateTime _expirationDateTime;
    /** true if the role assignment is activated. false if the role assignment is deactivated. */
    private Boolean _isElevated;
    /** Result message set by the service. */
    private String _resultMessage;
    /** Role identifier. In GUID string format. */
    private String _roleId;
    /** Read-only. Nullable. The associated role information. */
    private PrivilegedRole _roleInfo;
    /** User identifier. In GUID string format. */
    private String _userId;
    /**
     * Instantiates a new privilegedRoleAssignment and sets the default values.
     * @return a void
     */
    public PrivilegedRoleAssignment() {
        super();
        this.setOdataType("#microsoft.graph.privilegedRoleAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleAssignment
     */
    @javax.annotation.Nonnull
    public static PrivilegedRoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleAssignment();
    }
    /**
     * Gets the expirationDateTime property value. The UTC DateTime when the temporary privileged role assignment will be expired. For permanent role assignment, the value is null.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedRoleAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("isElevated", (n) -> { currentObject.setIsElevated(n.getBooleanValue()); });
            this.put("resultMessage", (n) -> { currentObject.setResultMessage(n.getStringValue()); });
            this.put("roleId", (n) -> { currentObject.setRoleId(n.getStringValue()); });
            this.put("roleInfo", (n) -> { currentObject.setRoleInfo(n.getObjectValue(PrivilegedRole::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isElevated property value. true if the role assignment is activated. false if the role assignment is deactivated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsElevated() {
        return this._isElevated;
    }
    /**
     * Gets the resultMessage property value. Result message set by the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultMessage() {
        return this._resultMessage;
    }
    /**
     * Gets the roleId property value. Role identifier. In GUID string format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleInfo property value. Read-only. Nullable. The associated role information.
     * @return a privilegedRole
     */
    @javax.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this._roleInfo;
    }
    /**
     * Gets the userId property value. User identifier. In GUID string format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("isElevated", this.getIsElevated());
        writer.writeStringValue("resultMessage", this.getResultMessage());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleInfo", this.getRoleInfo());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the expirationDateTime property value. The UTC DateTime when the temporary privileged role assignment will be expired. For permanent role assignment, the value is null.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the isElevated property value. true if the role assignment is activated. false if the role assignment is deactivated.
     * @param value Value to set for the isElevated property.
     * @return a void
     */
    public void setIsElevated(@javax.annotation.Nullable final Boolean value) {
        this._isElevated = value;
    }
    /**
     * Sets the resultMessage property value. Result message set by the service.
     * @param value Value to set for the resultMessage property.
     * @return a void
     */
    public void setResultMessage(@javax.annotation.Nullable final String value) {
        this._resultMessage = value;
    }
    /**
     * Sets the roleId property value. Role identifier. In GUID string format.
     * @param value Value to set for the roleId property.
     * @return a void
     */
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleInfo property value. Read-only. Nullable. The associated role information.
     * @param value Value to set for the roleInfo property.
     * @return a void
     */
    public void setRoleInfo(@javax.annotation.Nullable final PrivilegedRole value) {
        this._roleInfo = value;
    }
    /**
     * Sets the userId property value. User identifier. In GUID string format.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
