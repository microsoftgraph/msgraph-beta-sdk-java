package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationPowerSchoolDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /** Indicates whether the source has multiple identifiers for a single student or teacher. */
    private Boolean _allowTeachersInMultipleSchools;
    /** The client ID used to connect to PowerSchool. */
    private String _clientId;
    /** The client secret to authenticate the connection to the PowerSchool instance. */
    private String _clientSecret;
    /** The connection URL to the PowerSchool instance. */
    private String _connectionUrl;
    /** Optional customization to be applied to the synchronization profile. */
    private EducationSynchronizationCustomizations _customizations;
    /** The list of schools to sync. */
    private java.util.List<String> _schoolsIds;
    /** The school year to sync. */
    private String _schoolYear;
    /**
     * Instantiates a new EducationPowerSchoolDataProvider and sets the default values.
     * @return a void
     */
    public EducationPowerSchoolDataProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationPowerSchoolDataProvider
     */
    @javax.annotation.Nonnull
    public static EducationPowerSchoolDataProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationPowerSchoolDataProvider();
    }
    /**
     * Gets the allowTeachersInMultipleSchools property value. Indicates whether the source has multiple identifiers for a single student or teacher.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTeachersInMultipleSchools() {
        return this._allowTeachersInMultipleSchools;
    }
    /**
     * Gets the clientId property value. The client ID used to connect to PowerSchool.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this._clientId;
    }
    /**
     * Gets the clientSecret property value. The client secret to authenticate the connection to the PowerSchool instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientSecret() {
        return this._clientSecret;
    }
    /**
     * Gets the connectionUrl property value. The connection URL to the PowerSchool instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectionUrl() {
        return this._connectionUrl;
    }
    /**
     * Gets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @return a educationSynchronizationCustomizations
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this._customizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationPowerSchoolDataProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowTeachersInMultipleSchools", (n) -> { currentObject.setAllowTeachersInMultipleSchools(n.getBooleanValue()); });
            this.put("clientId", (n) -> { currentObject.setClientId(n.getStringValue()); });
            this.put("clientSecret", (n) -> { currentObject.setClientSecret(n.getStringValue()); });
            this.put("connectionUrl", (n) -> { currentObject.setConnectionUrl(n.getStringValue()); });
            this.put("customizations", (n) -> { currentObject.setCustomizations(n.getObjectValue(EducationSynchronizationCustomizations::createFromDiscriminatorValue)); });
            this.put("schoolsIds", (n) -> { currentObject.setSchoolsIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("schoolYear", (n) -> { currentObject.setSchoolYear(n.getStringValue()); });
        }};
    }
    /**
     * Gets the schoolsIds property value. The list of schools to sync.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSchoolsIds() {
        return this._schoolsIds;
    }
    /**
     * Gets the schoolYear property value. The school year to sync.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchoolYear() {
        return this._schoolYear;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowTeachersInMultipleSchools", this.getAllowTeachersInMultipleSchools());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("connectionUrl", this.getConnectionUrl());
        writer.writeObjectValue("customizations", this.getCustomizations());
        writer.writeCollectionOfPrimitiveValues("schoolsIds", this.getSchoolsIds());
        writer.writeStringValue("schoolYear", this.getSchoolYear());
    }
    /**
     * Sets the allowTeachersInMultipleSchools property value. Indicates whether the source has multiple identifiers for a single student or teacher.
     * @param value Value to set for the allowTeachersInMultipleSchools property.
     * @return a void
     */
    public void setAllowTeachersInMultipleSchools(@javax.annotation.Nullable final Boolean value) {
        this._allowTeachersInMultipleSchools = value;
    }
    /**
     * Sets the clientId property value. The client ID used to connect to PowerSchool.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    public void setClientId(@javax.annotation.Nullable final String value) {
        this._clientId = value;
    }
    /**
     * Sets the clientSecret property value. The client secret to authenticate the connection to the PowerSchool instance.
     * @param value Value to set for the clientSecret property.
     * @return a void
     */
    public void setClientSecret(@javax.annotation.Nullable final String value) {
        this._clientSecret = value;
    }
    /**
     * Sets the connectionUrl property value. The connection URL to the PowerSchool instance.
     * @param value Value to set for the connectionUrl property.
     * @return a void
     */
    public void setConnectionUrl(@javax.annotation.Nullable final String value) {
        this._connectionUrl = value;
    }
    /**
     * Sets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @param value Value to set for the customizations property.
     * @return a void
     */
    public void setCustomizations(@javax.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this._customizations = value;
    }
    /**
     * Sets the schoolsIds property value. The list of schools to sync.
     * @param value Value to set for the schoolsIds property.
     * @return a void
     */
    public void setSchoolsIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._schoolsIds = value;
    }
    /**
     * Sets the schoolYear property value. The school year to sync.
     * @param value Value to set for the schoolYear property.
     * @return a void
     */
    public void setSchoolYear(@javax.annotation.Nullable final String value) {
        this._schoolYear = value;
    }
}
