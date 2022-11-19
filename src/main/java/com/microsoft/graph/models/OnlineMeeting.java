package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the commsApplication singleton. */
public class OnlineMeeting extends Entity implements Parsable {
    /** Indicates whether attendees can turn on their camera. */
    private Boolean _allowAttendeeToEnableCamera;
    /** Indicates whether attendees can turn on their microphone. */
    private Boolean _allowAttendeeToEnableMic;
    /** Specifies who can be a presenter in a meeting. */
    private OnlineMeetingPresenters _allowedPresenters;
    /** Indicates if Teams reactions are enabled for the meeting. */
    private Boolean _allowTeamworkReactions;
    /** The content stream of the alternative recording of a Microsoft Teams live event. Read-only. */
    private byte[] _alternativeRecording;
    /** The anonymizeIdentityForRoles property */
    private java.util.List<OnlineMeetingRole> _anonymizeIdentityForRoles;
    /** The attendance reports of an online meeting. Read-only. */
    private java.util.List<MeetingAttendanceReport> _attendanceReports;
    /** The content stream of the attendee report of a Teams live event. Read-only. */
    private byte[] _attendeeReport;
    /** The phone access (dial-in) information for an online meeting. Read-only. */
    private AudioConferencing _audioConferencing;
    /** Settings related to a live event. */
    private BroadcastMeetingSettings _broadcastSettings;
    /** The capabilities property */
    private java.util.List<MeetingCapabilities> _capabilities;
    /** The chat information associated with this online meeting. */
    private ChatInfo _chatInfo;
    /** The meeting creation time in UTC. Read-only. */
    private OffsetDateTime _creationDateTime;
    /** The meeting end time in UTC. */
    private OffsetDateTime _endDateTime;
    /** The external ID. A custom ID. Optional. */
    private String _externalId;
    /** Indicates whether this is a Teams live event. */
    private Boolean _isBroadcast;
    /** Indicates whether to announce when callers join or leave. */
    private Boolean _isEntryExitAnnounced;
    /** The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only. */
    private ItemBody _joinInformation;
    /** Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. */
    private JoinMeetingIdSettings _joinMeetingIdSettings;
    /** The joinUrl property */
    private String _joinUrl;
    /** The join URL of the online meeting. Read-only. */
    private String _joinWebUrl;
    /** Specifies which participants can bypass the meeting lobby. */
    private LobbyBypassSettings _lobbyBypassSettings;
    /** The meetingAttendanceReport property */
    private MeetingAttendanceReport _meetingAttendanceReport;
    /** The participants associated with the online meeting. This includes the organizer and the attendees. */
    private MeetingParticipants _participants;
    /** Indicates whether to record the meeting automatically. */
    private Boolean _recordAutomatically;
    /** The content stream of the recording of a Teams live event. Read-only. */
    private byte[] _recording;
    /** The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled. */
    private MeetingRegistration _registration;
    /** The meeting start time in UTC. */
    private OffsetDateTime _startDateTime;
    /** The subject of the online meeting. */
    private String _subject;
    /** The transcripts of an online meeting. Read-only. */
    private java.util.List<CallTranscript> _transcripts;
    /** The video teleconferencing ID. Read-only. */
    private String _videoTeleconferenceId;
    /** The virtualAppointment property */
    private VirtualAppointment _virtualAppointment;
    /**
     * Instantiates a new onlineMeeting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnlineMeeting() {
        super();
        this.setOdataType("#microsoft.graph.onlineMeeting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onlineMeeting
     */
    @javax.annotation.Nonnull
    public static OnlineMeeting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeeting();
    }
    /**
     * Gets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAttendeeToEnableCamera() {
        return this._allowAttendeeToEnableCamera;
    }
    /**
     * Gets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAttendeeToEnableMic() {
        return this._allowAttendeeToEnableMic;
    }
    /**
     * Gets the allowedPresenters property value. Specifies who can be a presenter in a meeting.
     * @return a onlineMeetingPresenters
     */
    @javax.annotation.Nullable
    public OnlineMeetingPresenters getAllowedPresenters() {
        return this._allowedPresenters;
    }
    /**
     * Gets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTeamworkReactions() {
        return this._allowTeamworkReactions;
    }
    /**
     * Gets the alternativeRecording property value. The content stream of the alternative recording of a Microsoft Teams live event. Read-only.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getAlternativeRecording() {
        return this._alternativeRecording;
    }
    /**
     * Gets the anonymizeIdentityForRoles property value. The anonymizeIdentityForRoles property
     * @return a onlineMeetingRole
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeetingRole> getAnonymizeIdentityForRoles() {
        return this._anonymizeIdentityForRoles;
    }
    /**
     * Gets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @return a meetingAttendanceReport
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingAttendanceReport> getAttendanceReports() {
        return this._attendanceReports;
    }
    /**
     * Gets the attendeeReport property value. The content stream of the attendee report of a Teams live event. Read-only.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getAttendeeReport() {
        return this._attendeeReport;
    }
    /**
     * Gets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @return a audioConferencing
     */
    @javax.annotation.Nullable
    public AudioConferencing getAudioConferencing() {
        return this._audioConferencing;
    }
    /**
     * Gets the broadcastSettings property value. Settings related to a live event.
     * @return a broadcastMeetingSettings
     */
    @javax.annotation.Nullable
    public BroadcastMeetingSettings getBroadcastSettings() {
        return this._broadcastSettings;
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a meetingCapabilities
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingCapabilities> getCapabilities() {
        return this._capabilities;
    }
    /**
     * Gets the chatInfo property value. The chat information associated with this online meeting.
     * @return a chatInfo
     */
    @javax.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this._chatInfo;
    }
    /**
     * Gets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this._creationDateTime;
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the externalId property value. The external ID. A custom ID. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnlineMeeting currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAttendeeToEnableCamera", (n) -> { currentObject.setAllowAttendeeToEnableCamera(n.getBooleanValue()); });
        deserializerMap.put("allowAttendeeToEnableMic", (n) -> { currentObject.setAllowAttendeeToEnableMic(n.getBooleanValue()); });
        deserializerMap.put("allowedPresenters", (n) -> { currentObject.setAllowedPresenters(n.getEnumValue(OnlineMeetingPresenters.class)); });
        deserializerMap.put("allowTeamworkReactions", (n) -> { currentObject.setAllowTeamworkReactions(n.getBooleanValue()); });
        deserializerMap.put("alternativeRecording", (n) -> { currentObject.setAlternativeRecording(n.getByteArrayValue()); });
        deserializerMap.put("anonymizeIdentityForRoles", (n) -> { currentObject.setAnonymizeIdentityForRoles(n.getCollectionOfEnumValues(OnlineMeetingRole.class)); });
        deserializerMap.put("attendanceReports", (n) -> { currentObject.setAttendanceReports(n.getCollectionOfObjectValues(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("attendeeReport", (n) -> { currentObject.setAttendeeReport(n.getByteArrayValue()); });
        deserializerMap.put("audioConferencing", (n) -> { currentObject.setAudioConferencing(n.getObjectValue(AudioConferencing::createFromDiscriminatorValue)); });
        deserializerMap.put("broadcastSettings", (n) -> { currentObject.setBroadcastSettings(n.getObjectValue(BroadcastMeetingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("capabilities", (n) -> { currentObject.setCapabilities(n.getCollectionOfEnumValues(MeetingCapabilities.class)); });
        deserializerMap.put("chatInfo", (n) -> { currentObject.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDateTime", (n) -> { currentObject.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
        deserializerMap.put("isBroadcast", (n) -> { currentObject.setIsBroadcast(n.getBooleanValue()); });
        deserializerMap.put("isEntryExitAnnounced", (n) -> { currentObject.setIsEntryExitAnnounced(n.getBooleanValue()); });
        deserializerMap.put("joinInformation", (n) -> { currentObject.setJoinInformation(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("joinMeetingIdSettings", (n) -> { currentObject.setJoinMeetingIdSettings(n.getObjectValue(JoinMeetingIdSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("joinUrl", (n) -> { currentObject.setJoinUrl(n.getStringValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { currentObject.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { currentObject.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingAttendanceReport", (n) -> { currentObject.setMeetingAttendanceReport(n.getObjectValue(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { currentObject.setParticipants(n.getObjectValue(MeetingParticipants::createFromDiscriminatorValue)); });
        deserializerMap.put("recordAutomatically", (n) -> { currentObject.setRecordAutomatically(n.getBooleanValue()); });
        deserializerMap.put("recording", (n) -> { currentObject.setRecording(n.getByteArrayValue()); });
        deserializerMap.put("registration", (n) -> { currentObject.setRegistration(n.getObjectValue(MeetingRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        deserializerMap.put("transcripts", (n) -> { currentObject.setTranscripts(n.getCollectionOfObjectValues(CallTranscript::createFromDiscriminatorValue)); });
        deserializerMap.put("videoTeleconferenceId", (n) -> { currentObject.setVideoTeleconferenceId(n.getStringValue()); });
        deserializerMap.put("virtualAppointment", (n) -> { currentObject.setVirtualAppointment(n.getObjectValue(VirtualAppointment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBroadcast property value. Indicates whether this is a Teams live event.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBroadcast() {
        return this._isBroadcast;
    }
    /**
     * Gets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEntryExitAnnounced() {
        return this._isEntryExitAnnounced;
    }
    /**
     * Gets the joinInformation property value. The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getJoinInformation() {
        return this._joinInformation;
    }
    /**
     * Gets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode.
     * @return a joinMeetingIdSettings
     */
    @javax.annotation.Nullable
    public JoinMeetingIdSettings getJoinMeetingIdSettings() {
        return this._joinMeetingIdSettings;
    }
    /**
     * Gets the joinUrl property value. The joinUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinUrl() {
        return this._joinUrl;
    }
    /**
     * Gets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this._joinWebUrl;
    }
    /**
     * Gets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @return a lobbyBypassSettings
     */
    @javax.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this._lobbyBypassSettings;
    }
    /**
     * Gets the meetingAttendanceReport property value. The meetingAttendanceReport property
     * @return a meetingAttendanceReport
     */
    @javax.annotation.Nullable
    public MeetingAttendanceReport getMeetingAttendanceReport() {
        return this._meetingAttendanceReport;
    }
    /**
     * Gets the participants property value. The participants associated with the online meeting. This includes the organizer and the attendees.
     * @return a meetingParticipants
     */
    @javax.annotation.Nullable
    public MeetingParticipants getParticipants() {
        return this._participants;
    }
    /**
     * Gets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRecordAutomatically() {
        return this._recordAutomatically;
    }
    /**
     * Gets the recording property value. The content stream of the recording of a Teams live event. Read-only.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getRecording() {
        return this._recording;
    }
    /**
     * Gets the registration property value. The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled.
     * @return a meetingRegistration
     */
    @javax.annotation.Nullable
    public MeetingRegistration getRegistration() {
        return this._registration;
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the subject property value. The subject of the online meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @return a callTranscript
     */
    @javax.annotation.Nullable
    public java.util.List<CallTranscript> getTranscripts() {
        return this._transcripts;
    }
    /**
     * Gets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVideoTeleconferenceId() {
        return this._videoTeleconferenceId;
    }
    /**
     * Gets the virtualAppointment property value. The virtualAppointment property
     * @return a virtualAppointment
     */
    @javax.annotation.Nullable
    public VirtualAppointment getVirtualAppointment() {
        return this._virtualAppointment;
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
        writer.writeBooleanValue("allowAttendeeToEnableCamera", this.getAllowAttendeeToEnableCamera());
        writer.writeBooleanValue("allowAttendeeToEnableMic", this.getAllowAttendeeToEnableMic());
        writer.writeEnumValue("allowedPresenters", this.getAllowedPresenters());
        writer.writeBooleanValue("allowTeamworkReactions", this.getAllowTeamworkReactions());
        writer.writeByteArrayValue("alternativeRecording", this.getAlternativeRecording());
        writer.writeCollectionOfEnumValues("anonymizeIdentityForRoles", this.getAnonymizeIdentityForRoles());
        writer.writeCollectionOfObjectValues("attendanceReports", this.getAttendanceReports());
        writer.writeByteArrayValue("attendeeReport", this.getAttendeeReport());
        writer.writeObjectValue("audioConferencing", this.getAudioConferencing());
        writer.writeObjectValue("broadcastSettings", this.getBroadcastSettings());
        writer.writeCollectionOfEnumValues("capabilities", this.getCapabilities());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeBooleanValue("isBroadcast", this.getIsBroadcast());
        writer.writeBooleanValue("isEntryExitAnnounced", this.getIsEntryExitAnnounced());
        writer.writeObjectValue("joinInformation", this.getJoinInformation());
        writer.writeObjectValue("joinMeetingIdSettings", this.getJoinMeetingIdSettings());
        writer.writeStringValue("joinUrl", this.getJoinUrl());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeObjectValue("lobbyBypassSettings", this.getLobbyBypassSettings());
        writer.writeObjectValue("meetingAttendanceReport", this.getMeetingAttendanceReport());
        writer.writeObjectValue("participants", this.getParticipants());
        writer.writeBooleanValue("recordAutomatically", this.getRecordAutomatically());
        writer.writeByteArrayValue("recording", this.getRecording());
        writer.writeObjectValue("registration", this.getRegistration());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfObjectValues("transcripts", this.getTranscripts());
        writer.writeStringValue("videoTeleconferenceId", this.getVideoTeleconferenceId());
        writer.writeObjectValue("virtualAppointment", this.getVirtualAppointment());
    }
    /**
     * Sets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @param value Value to set for the allowAttendeeToEnableCamera property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAttendeeToEnableCamera(@javax.annotation.Nullable final Boolean value) {
        this._allowAttendeeToEnableCamera = value;
    }
    /**
     * Sets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @param value Value to set for the allowAttendeeToEnableMic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAttendeeToEnableMic(@javax.annotation.Nullable final Boolean value) {
        this._allowAttendeeToEnableMic = value;
    }
    /**
     * Sets the allowedPresenters property value. Specifies who can be a presenter in a meeting.
     * @param value Value to set for the allowedPresenters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedPresenters(@javax.annotation.Nullable final OnlineMeetingPresenters value) {
        this._allowedPresenters = value;
    }
    /**
     * Sets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @param value Value to set for the allowTeamworkReactions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowTeamworkReactions(@javax.annotation.Nullable final Boolean value) {
        this._allowTeamworkReactions = value;
    }
    /**
     * Sets the alternativeRecording property value. The content stream of the alternative recording of a Microsoft Teams live event. Read-only.
     * @param value Value to set for the alternativeRecording property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeRecording(@javax.annotation.Nullable final byte[] value) {
        this._alternativeRecording = value;
    }
    /**
     * Sets the anonymizeIdentityForRoles property value. The anonymizeIdentityForRoles property
     * @param value Value to set for the anonymizeIdentityForRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnonymizeIdentityForRoles(@javax.annotation.Nullable final java.util.List<OnlineMeetingRole> value) {
        this._anonymizeIdentityForRoles = value;
    }
    /**
     * Sets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @param value Value to set for the attendanceReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendanceReports(@javax.annotation.Nullable final java.util.List<MeetingAttendanceReport> value) {
        this._attendanceReports = value;
    }
    /**
     * Sets the attendeeReport property value. The content stream of the attendee report of a Teams live event. Read-only.
     * @param value Value to set for the attendeeReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendeeReport(@javax.annotation.Nullable final byte[] value) {
        this._attendeeReport = value;
    }
    /**
     * Sets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @param value Value to set for the audioConferencing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudioConferencing(@javax.annotation.Nullable final AudioConferencing value) {
        this._audioConferencing = value;
    }
    /**
     * Sets the broadcastSettings property value. Settings related to a live event.
     * @param value Value to set for the broadcastSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBroadcastSettings(@javax.annotation.Nullable final BroadcastMeetingSettings value) {
        this._broadcastSettings = value;
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final java.util.List<MeetingCapabilities> value) {
        this._capabilities = value;
    }
    /**
     * Sets the chatInfo property value. The chat information associated with this online meeting.
     * @param value Value to set for the chatInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatInfo(@javax.annotation.Nullable final ChatInfo value) {
        this._chatInfo = value;
    }
    /**
     * Sets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._creationDateTime = value;
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the externalId property value. The external ID. A custom ID. Optional.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the isBroadcast property value. Indicates whether this is a Teams live event.
     * @param value Value to set for the isBroadcast property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBroadcast(@javax.annotation.Nullable final Boolean value) {
        this._isBroadcast = value;
    }
    /**
     * Sets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @param value Value to set for the isEntryExitAnnounced property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEntryExitAnnounced(@javax.annotation.Nullable final Boolean value) {
        this._isEntryExitAnnounced = value;
    }
    /**
     * Sets the joinInformation property value. The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only.
     * @param value Value to set for the joinInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinInformation(@javax.annotation.Nullable final ItemBody value) {
        this._joinInformation = value;
    }
    /**
     * Sets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode.
     * @param value Value to set for the joinMeetingIdSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinMeetingIdSettings(@javax.annotation.Nullable final JoinMeetingIdSettings value) {
        this._joinMeetingIdSettings = value;
    }
    /**
     * Sets the joinUrl property value. The joinUrl property
     * @param value Value to set for the joinUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinUrl(@javax.annotation.Nullable final String value) {
        this._joinUrl = value;
    }
    /**
     * Sets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this._joinWebUrl = value;
    }
    /**
     * Sets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @param value Value to set for the lobbyBypassSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLobbyBypassSettings(@javax.annotation.Nullable final LobbyBypassSettings value) {
        this._lobbyBypassSettings = value;
    }
    /**
     * Sets the meetingAttendanceReport property value. The meetingAttendanceReport property
     * @param value Value to set for the meetingAttendanceReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingAttendanceReport(@javax.annotation.Nullable final MeetingAttendanceReport value) {
        this._meetingAttendanceReport = value;
    }
    /**
     * Sets the participants property value. The participants associated with the online meeting. This includes the organizer and the attendees.
     * @param value Value to set for the participants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipants(@javax.annotation.Nullable final MeetingParticipants value) {
        this._participants = value;
    }
    /**
     * Sets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @param value Value to set for the recordAutomatically property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordAutomatically(@javax.annotation.Nullable final Boolean value) {
        this._recordAutomatically = value;
    }
    /**
     * Sets the recording property value. The content stream of the recording of a Teams live event. Read-only.
     * @param value Value to set for the recording property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecording(@javax.annotation.Nullable final byte[] value) {
        this._recording = value;
    }
    /**
     * Sets the registration property value. The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled.
     * @param value Value to set for the registration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistration(@javax.annotation.Nullable final MeetingRegistration value) {
        this._registration = value;
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the subject property value. The subject of the online meeting.
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @param value Value to set for the transcripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTranscripts(@javax.annotation.Nullable final java.util.List<CallTranscript> value) {
        this._transcripts = value;
    }
    /**
     * Sets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @param value Value to set for the videoTeleconferenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVideoTeleconferenceId(@javax.annotation.Nullable final String value) {
        this._videoTeleconferenceId = value;
    }
    /**
     * Sets the virtualAppointment property value. The virtualAppointment property
     * @param value Value to set for the virtualAppointment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVirtualAppointment(@javax.annotation.Nullable final VirtualAppointment value) {
        this._virtualAppointment = value;
    }
}
