package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationPowerSchoolDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /**
     * Indicates whether the source has multiple identifiers for a single student or teacher.
     */
    private Boolean allowTeachersInMultipleSchools;
    /**
     * The client ID used to connect to PowerSchool.
     */
    private String clientId;
    /**
     * The client secret to authenticate the connection to the PowerSchool instance.
     */
    private String clientSecret;
    /**
     * The connection URL to the PowerSchool instance.
     */
    private String connectionUrl;
    /**
     * Optional customization to be applied to the synchronization profile.
     */
    private EducationSynchronizationCustomizations customizations;
    /**
     * The list of schools to sync.
     */
    private java.util.List<String> schoolsIds;
    /**
     * The school year to sync.
     */
    private String schoolYear;
    /**
     * Instantiates a new educationPowerSchoolDataProvider and sets the default values.
     */
    public EducationPowerSchoolDataProvider() {
        super();
        this.setOdataType("#microsoft.graph.educationPowerSchoolDataProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationPowerSchoolDataProvider
     */
    @jakarta.annotation.Nonnull
    public static EducationPowerSchoolDataProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationPowerSchoolDataProvider();
    }
    /**
     * Gets the allowTeachersInMultipleSchools property value. Indicates whether the source has multiple identifiers for a single student or teacher.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeachersInMultipleSchools() {
        return this.allowTeachersInMultipleSchools;
    }
    /**
     * Gets the clientId property value. The client ID used to connect to PowerSchool.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Gets the clientSecret property value. The client secret to authenticate the connection to the PowerSchool instance.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Gets the connectionUrl property value. The connection URL to the PowerSchool instance.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConnectionUrl() {
        return this.connectionUrl;
    }
    /**
     * Gets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @return a educationSynchronizationCustomizations
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this.customizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowTeachersInMultipleSchools", (n) -> { this.setAllowTeachersInMultipleSchools(n.getBooleanValue()); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("connectionUrl", (n) -> { this.setConnectionUrl(n.getStringValue()); });
        deserializerMap.put("customizations", (n) -> { this.setCustomizations(n.getObjectValue(EducationSynchronizationCustomizations::createFromDiscriminatorValue)); });
        deserializerMap.put("schoolsIds", (n) -> { this.setSchoolsIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("schoolYear", (n) -> { this.setSchoolYear(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the schoolsIds property value. The list of schools to sync.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSchoolsIds() {
        return this.schoolsIds;
    }
    /**
     * Gets the schoolYear property value. The school year to sync.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSchoolYear() {
        return this.schoolYear;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAllowTeachersInMultipleSchools(@jakarta.annotation.Nullable final Boolean value) {
        this.allowTeachersInMultipleSchools = value;
    }
    /**
     * Sets the clientId property value. The client ID used to connect to PowerSchool.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the clientSecret property value. The client secret to authenticate the connection to the PowerSchool instance.
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
    /**
     * Sets the connectionUrl property value. The connection URL to the PowerSchool instance.
     * @param value Value to set for the connectionUrl property.
     */
    public void setConnectionUrl(@jakarta.annotation.Nullable final String value) {
        this.connectionUrl = value;
    }
    /**
     * Sets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @param value Value to set for the customizations property.
     */
    public void setCustomizations(@jakarta.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this.customizations = value;
    }
    /**
     * Sets the schoolsIds property value. The list of schools to sync.
     * @param value Value to set for the schoolsIds property.
     */
    public void setSchoolsIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.schoolsIds = value;
    }
    /**
     * Sets the schoolYear property value. The school year to sync.
     * @param value Value to set for the schoolYear property.
     */
    public void setSchoolYear(@jakarta.annotation.Nullable final String value) {
        this.schoolYear = value;
    }
}
