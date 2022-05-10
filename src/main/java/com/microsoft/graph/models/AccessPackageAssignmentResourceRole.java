package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentResourceRole extends Entity implements Parsable {
    /** The access package assignments resulting in this role assignment. Read-only. Nullable. */
    private java.util.List<AccessPackageAssignment> _accessPackageAssignments;
    /** Read-only. Nullable. */
    private AccessPackageResourceRole _accessPackageResourceRole;
    /** Read-only. Nullable. */
    private AccessPackageResourceScope _accessPackageResourceScope;
    /** Read-only. Nullable. Supports $filter (eq) on objectId and $expand query parameters. */
    private AccessPackageSubject _accessPackageSubject;
    /** A unique identifier relative to the origin system, corresponding to the originId property of the accessPackageResourceRole. */
    private String _originId;
    /** The system where the role assignment is to be created or has been created for an access package assignment, such as SharePointOnline, AadGroup or AadApplication, corresponding to the originSystem property of the accessPackageResourceRole. */
    private String _originSystem;
    /** The value is PendingFulfillment when the access package assignment has not yet been delivered to the origin system, and Fulfilled when the access package assignment has been delivered to the origin system. */
    private String _status;
    /**
     * Instantiates a new accessPackageAssignmentResourceRole and sets the default values.
     * @return a void
     */
    public AccessPackageAssignmentResourceRole() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentResourceRole
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentResourceRole createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentResourceRole();
    }
    /**
     * Gets the accessPackageAssignments property value. The access package assignments resulting in this role assignment. Read-only. Nullable.
     * @return a accessPackageAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignment> getAccessPackageAssignments() {
        return this._accessPackageAssignments;
    }
    /**
     * Gets the accessPackageResourceRole property value. Read-only. Nullable.
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nullable
    public AccessPackageResourceRole getAccessPackageResourceRole() {
        return this._accessPackageResourceRole;
    }
    /**
     * Gets the accessPackageResourceScope property value. Read-only. Nullable.
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public AccessPackageResourceScope getAccessPackageResourceScope() {
        return this._accessPackageResourceScope;
    }
    /**
     * Gets the accessPackageSubject property value. Read-only. Nullable. Supports $filter (eq) on objectId and $expand query parameters.
     * @return a accessPackageSubject
     */
    @javax.annotation.Nullable
    public AccessPackageSubject getAccessPackageSubject() {
        return this._accessPackageSubject;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentResourceRole currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessPackageAssignments", (n) -> { currentObject.setAccessPackageAssignments(n.getCollectionOfObjectValues(AccessPackageAssignment::createFromDiscriminatorValue)); });
            this.put("accessPackageResourceRole", (n) -> { currentObject.setAccessPackageResourceRole(n.getObjectValue(AccessPackageResourceRole::createFromDiscriminatorValue)); });
            this.put("accessPackageResourceScope", (n) -> { currentObject.setAccessPackageResourceScope(n.getObjectValue(AccessPackageResourceScope::createFromDiscriminatorValue)); });
            this.put("accessPackageSubject", (n) -> { currentObject.setAccessPackageSubject(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
            this.put("originId", (n) -> { currentObject.setOriginId(n.getStringValue()); });
            this.put("originSystem", (n) -> { currentObject.setOriginSystem(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the originId property value. A unique identifier relative to the origin system, corresponding to the originId property of the accessPackageResourceRole.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginId() {
        return this._originId;
    }
    /**
     * Gets the originSystem property value. The system where the role assignment is to be created or has been created for an access package assignment, such as SharePointOnline, AadGroup or AadApplication, corresponding to the originSystem property of the accessPackageResourceRole.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginSystem() {
        return this._originSystem;
    }
    /**
     * Gets the status property value. The value is PendingFulfillment when the access package assignment has not yet been delivered to the origin system, and Fulfilled when the access package assignment has been delivered to the origin system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackageAssignments", this.getAccessPackageAssignments());
        writer.writeObjectValue("accessPackageResourceRole", this.getAccessPackageResourceRole());
        writer.writeObjectValue("accessPackageResourceScope", this.getAccessPackageResourceScope());
        writer.writeObjectValue("accessPackageSubject", this.getAccessPackageSubject());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the accessPackageAssignments property value. The access package assignments resulting in this role assignment. Read-only. Nullable.
     * @param value Value to set for the accessPackageAssignments property.
     * @return a void
     */
    public void setAccessPackageAssignments(@javax.annotation.Nullable final java.util.List<AccessPackageAssignment> value) {
        this._accessPackageAssignments = value;
    }
    /**
     * Sets the accessPackageResourceRole property value. Read-only. Nullable.
     * @param value Value to set for the accessPackageResourceRole property.
     * @return a void
     */
    public void setAccessPackageResourceRole(@javax.annotation.Nullable final AccessPackageResourceRole value) {
        this._accessPackageResourceRole = value;
    }
    /**
     * Sets the accessPackageResourceScope property value. Read-only. Nullable.
     * @param value Value to set for the accessPackageResourceScope property.
     * @return a void
     */
    public void setAccessPackageResourceScope(@javax.annotation.Nullable final AccessPackageResourceScope value) {
        this._accessPackageResourceScope = value;
    }
    /**
     * Sets the accessPackageSubject property value. Read-only. Nullable. Supports $filter (eq) on objectId and $expand query parameters.
     * @param value Value to set for the accessPackageSubject property.
     * @return a void
     */
    public void setAccessPackageSubject(@javax.annotation.Nullable final AccessPackageSubject value) {
        this._accessPackageSubject = value;
    }
    /**
     * Sets the originId property value. A unique identifier relative to the origin system, corresponding to the originId property of the accessPackageResourceRole.
     * @param value Value to set for the originId property.
     * @return a void
     */
    public void setOriginId(@javax.annotation.Nullable final String value) {
        this._originId = value;
    }
    /**
     * Sets the originSystem property value. The system where the role assignment is to be created or has been created for an access package assignment, such as SharePointOnline, AadGroup or AadApplication, corresponding to the originSystem property of the accessPackageResourceRole.
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    public void setOriginSystem(@javax.annotation.Nullable final String value) {
        this._originSystem = value;
    }
    /**
     * Sets the status property value. The value is PendingFulfillment when the access package assignment has not yet been delivered to the origin system, and Fulfilled when the access package assignment has been delivered to the origin system.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
