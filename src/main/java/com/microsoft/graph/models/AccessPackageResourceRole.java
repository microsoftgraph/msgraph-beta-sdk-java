package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class AccessPackageResourceRole extends Entity implements Parsable {
    /** The accessPackageResource property */
    private AccessPackageResource _accessPackageResource;
    /** A description for the resource role. */
    private String _description;
    /** The display name of the resource role such as the role defined by the application. */
    private String _displayName;
    /** The unique identifier of the resource role in the origin system. For a SharePoint Online site, the originId will be the sequence number of the role in the site. */
    private String _originId;
    /** The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup. */
    private String _originSystem;
    /**
     * Instantiates a new accessPackageResourceRole and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceRole() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageResourceRole");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceRole createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRole();
    }
    /**
     * Gets the accessPackageResource property value. The accessPackageResource property
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public AccessPackageResource getAccessPackageResource() {
        return this._accessPackageResource;
    }
    /**
     * Gets the description property value. A description for the resource role.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the resource role such as the role defined by the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageResourceRole currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackageResource", (n) -> { currentObject.setAccessPackageResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("originId", (n) -> { currentObject.setOriginId(n.getStringValue()); });
            this.put("originSystem", (n) -> { currentObject.setOriginSystem(n.getStringValue()); });
        }};
    }
    /**
     * Gets the originId property value. The unique identifier of the resource role in the origin system. For a SharePoint Online site, the originId will be the sequence number of the role in the site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginId() {
        return this._originId;
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginSystem() {
        return this._originSystem;
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
        writer.writeObjectValue("accessPackageResource", this.getAccessPackageResource());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
    }
    /**
     * Sets the accessPackageResource property value. The accessPackageResource property
     * @param value Value to set for the accessPackageResource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResource(@javax.annotation.Nullable final AccessPackageResource value) {
        this._accessPackageResource = value;
    }
    /**
     * Sets the description property value. A description for the resource role.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the resource role such as the role defined by the application.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the originId property value. The unique identifier of the resource role in the origin system. For a SharePoint Online site, the originId will be the sequence number of the role in the site.
     * @param value Value to set for the originId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginId(@javax.annotation.Nullable final String value) {
        this._originId = value;
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginSystem(@javax.annotation.Nullable final String value) {
        this._originSystem = value;
    }
}
