package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class ProfileCardProperty extends Entity implements Parsable {
    /** Allows an administrator to set a custom display label for the directory property and localize it for the users in their tenant. */
    private java.util.List<ProfileCardAnnotation> _annotations;
    /** Identifies a profileCardProperty resource in Get, Update, or Delete operations. Allows an administrator to surface hidden Azure Active Directory (Azure AD) properties on the Microsoft 365 profile card within their tenant. When present, the Azure AD field referenced in this field will be visible to all users in your tenant on the contact pane of the profile card. Allowed values for this field are: UserPrincipalName, Fax, StreetAddress, PostalCode, StateOrProvince, Alias, CustomAttribute1,  CustomAttribute2, CustomAttribute3, CustomAttribute4, CustomAttribute5, CustomAttribute6, CustomAttribute7, CustomAttribute8, CustomAttribute9, CustomAttribute10, CustomAttribute11, CustomAttribute12, CustomAttribute13, CustomAttribute14, CustomAttribute15. */
    private String _directoryPropertyName;
    /**
     * Instantiates a new profileCardProperty and sets the default values.
     * @return a void
     */
    public ProfileCardProperty() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a profileCardProperty
     */
    @javax.annotation.Nonnull
    public static ProfileCardProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfileCardProperty();
    }
    /**
     * Gets the annotations property value. Allows an administrator to set a custom display label for the directory property and localize it for the users in their tenant.
     * @return a profileCardAnnotation
     */
    @javax.annotation.Nullable
    public java.util.List<ProfileCardAnnotation> getAnnotations() {
        return this._annotations;
    }
    /**
     * Gets the directoryPropertyName property value. Identifies a profileCardProperty resource in Get, Update, or Delete operations. Allows an administrator to surface hidden Azure Active Directory (Azure AD) properties on the Microsoft 365 profile card within their tenant. When present, the Azure AD field referenced in this field will be visible to all users in your tenant on the contact pane of the profile card. Allowed values for this field are: UserPrincipalName, Fax, StreetAddress, PostalCode, StateOrProvince, Alias, CustomAttribute1,  CustomAttribute2, CustomAttribute3, CustomAttribute4, CustomAttribute5, CustomAttribute6, CustomAttribute7, CustomAttribute8, CustomAttribute9, CustomAttribute10, CustomAttribute11, CustomAttribute12, CustomAttribute13, CustomAttribute14, CustomAttribute15.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDirectoryPropertyName() {
        return this._directoryPropertyName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProfileCardProperty currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("annotations", (n) -> { currentObject.setAnnotations(n.getCollectionOfObjectValues(ProfileCardAnnotation::createFromDiscriminatorValue)); });
            this.put("directoryPropertyName", (n) -> { currentObject.setDirectoryPropertyName(n.getStringValue()); });
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
        writer.writeCollectionOfObjectValues("annotations", this.getAnnotations());
        writer.writeStringValue("directoryPropertyName", this.getDirectoryPropertyName());
    }
    /**
     * Sets the annotations property value. Allows an administrator to set a custom display label for the directory property and localize it for the users in their tenant.
     * @param value Value to set for the annotations property.
     * @return a void
     */
    public void setAnnotations(@javax.annotation.Nullable final java.util.List<ProfileCardAnnotation> value) {
        this._annotations = value;
    }
    /**
     * Sets the directoryPropertyName property value. Identifies a profileCardProperty resource in Get, Update, or Delete operations. Allows an administrator to surface hidden Azure Active Directory (Azure AD) properties on the Microsoft 365 profile card within their tenant. When present, the Azure AD field referenced in this field will be visible to all users in your tenant on the contact pane of the profile card. Allowed values for this field are: UserPrincipalName, Fax, StreetAddress, PostalCode, StateOrProvince, Alias, CustomAttribute1,  CustomAttribute2, CustomAttribute3, CustomAttribute4, CustomAttribute5, CustomAttribute6, CustomAttribute7, CustomAttribute8, CustomAttribute9, CustomAttribute10, CustomAttribute11, CustomAttribute12, CustomAttribute13, CustomAttribute14, CustomAttribute15.
     * @param value Value to set for the directoryPropertyName property.
     * @return a void
     */
    public void setDirectoryPropertyName(@javax.annotation.Nullable final String value) {
        this._directoryPropertyName = value;
    }
}
