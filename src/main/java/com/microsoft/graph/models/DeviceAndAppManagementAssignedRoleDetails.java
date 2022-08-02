package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The set of Role Definitions and Role Assignments assigned to a user. */
public class DeviceAndAppManagementAssignedRoleDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Role Assignment IDs for the specifc Role Assignments assigned to a user. This property is read-only. */
    private java.util.List<String> _roleAssignmentIds;
    /** Role Definition IDs for the specifc Role Definitions assigned to a user. This property is read-only. */
    private java.util.List<String> _roleDefinitionIds;
    /**
     * Instantiates a new deviceAndAppManagementAssignedRoleDetails and sets the default values.
     * @return a void
     */
    public DeviceAndAppManagementAssignedRoleDetails() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceAndAppManagementAssignedRoleDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAndAppManagementAssignedRoleDetails
     */
    @javax.annotation.Nonnull
    public static DeviceAndAppManagementAssignedRoleDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAndAppManagementAssignedRoleDetails();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceAndAppManagementAssignedRoleDetails currentObject = this;
        return new HashMap<>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("roleAssignmentIds", (n) -> { currentObject.setRoleAssignmentIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("roleDefinitionIds", (n) -> { currentObject.setRoleDefinitionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the roleAssignmentIds property value. Role Assignment IDs for the specifc Role Assignments assigned to a user. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleAssignmentIds() {
        return this._roleAssignmentIds;
    }
    /**
     * Gets the roleDefinitionIds property value. Role Definition IDs for the specifc Role Definitions assigned to a user. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleDefinitionIds() {
        return this._roleDefinitionIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("roleAssignmentIds", this.getRoleAssignmentIds());
        writer.writeCollectionOfPrimitiveValues("roleDefinitionIds", this.getRoleDefinitionIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the roleAssignmentIds property value. Role Assignment IDs for the specifc Role Assignments assigned to a user. This property is read-only.
     * @param value Value to set for the roleAssignmentIds property.
     * @return a void
     */
    public void setRoleAssignmentIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleAssignmentIds = value;
    }
    /**
     * Sets the roleDefinitionIds property value. Role Definition IDs for the specifc Role Definitions assigned to a user. This property is read-only.
     * @param value Value to set for the roleDefinitionIds property.
     * @return a void
     */
    public void setRoleDefinitionIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleDefinitionIds = value;
    }
}
