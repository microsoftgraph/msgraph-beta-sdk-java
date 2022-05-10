package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleAssignment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignmentType property */
    private DelegatedPrivilegeStatus _assignmentType;
    /** The roles property */
    private java.util.List<RoleDefinition> _roles;
    /**
     * Instantiates a new roleAssignment and sets the default values.
     * @return a void
     */
    public RoleAssignment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleAssignment
     */
    @javax.annotation.Nonnull
    public static RoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleAssignment();
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
     * Gets the assignmentType property value. The assignmentType property
     * @return a delegatedPrivilegeStatus
     */
    @javax.annotation.Nullable
    public DelegatedPrivilegeStatus getAssignmentType() {
        return this._assignmentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RoleAssignment currentObject = this;
        return new HashMap<>(2) {{
            this.put("assignmentType", (n) -> { currentObject.setAssignmentType(n.getEnumValue(DelegatedPrivilegeStatus.class)); });
            this.put("roles", (n) -> { currentObject.setRoles(n.getCollectionOfObjectValues(RoleDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the roles property value. The roles property
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<RoleDefinition> getRoles() {
        return this._roles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentType", this.getAssignmentType());
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
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
     * Sets the assignmentType property value. The assignmentType property
     * @param value Value to set for the assignmentType property.
     * @return a void
     */
    public void setAssignmentType(@javax.annotation.Nullable final DelegatedPrivilegeStatus value) {
        this._assignmentType = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    public void setRoles(@javax.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this._roles = value;
    }
}
